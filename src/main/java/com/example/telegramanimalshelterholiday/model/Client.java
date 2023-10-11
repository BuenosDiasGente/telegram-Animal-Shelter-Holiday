package com.example.telegramanimalshelterholiday.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Client {
    @Id
    @SequenceGenerator(name = "clientSequence", sequenceName = "client_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientSequence")
    @Column(name = "id")
    private Long id;
    @Column(name = "chat_id")
    private Long chatId;
    @Column(name = "user_name")
    private String userName;


    public Client(Long chatId, String userName) {
        this.chatId = chatId;
        this.userName = userName;
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(chatId, client.chatId) && Objects.equals(userName, client.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chatId, userName);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", chatId=" + chatId +
                ", userName='" + userName + '\'' +
                ", shelter=" + shelter +
                '}';
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;


}
