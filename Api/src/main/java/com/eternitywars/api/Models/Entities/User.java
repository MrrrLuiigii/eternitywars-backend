package com.eternitywars.api.Models.Entities;

import com.eternitywars.api.Models.Enums.AccountStatus;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends Account
{
    @Column(name = "email", unique = true, nullable = false, length = 64)
    private String email;

    @Column(name = "gold", nullable = false)
    private int gold;

    @Column(name = "pack_amount", nullable = false)
    private int packAmount;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<CardCollection> cardCollections;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<ChatUser> chats;


    public User()
    {
    }

    public User(int userId)
    {
        this.userId = userId;
    }

    public User(int id, String email, String username, AccountStatus accountStatus, int gold, int packAmount)
    {
        super(id, username, accountStatus);
        this.email = email;
        this.gold = gold;
        this.packAmount = packAmount;
    }

    public User(int id, String username, AccountStatus accountStatus, String email, int gold, int packAmount)
    {
        super(id, username, accountStatus);
        this.email = email;
        this.gold = gold;
        this.packAmount = packAmount;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getGold()
    {
        return gold;
    }

    public void setGold(int gold)
    {
        this.gold = gold;
    }

    public int getPackAmount()
    {
        return packAmount;
    }

    public void setPackAmount(int packAmount)
    {
        this.packAmount = packAmount;
    }

    public List<CardCollection> getCardCollections()
    {
        return cardCollections;
    }

    public void setCardCollections(List<CardCollection> cardCollections)
    {
        this.cardCollections = cardCollections;
    }

    public List<ChatUser> getChats()
    {
        return chats;
    }

    public void setChats(List<ChatUser> chats)
    {
        this.chats = chats;
    }
}
