package com.eternitywars.api.Models;

import com.eternitywars.api.Models.Entities.Lobby;

import java.util.ArrayList;
import java.util.List;

public class Lobbies
{
    private List<Lobby> lobbies;

    public Lobbies()
    {
        lobbies = new ArrayList<>();
    }

    public List<Lobby> getLobbies()
    {
        return lobbies;
    }

    public void addLobby(Lobby lobby)
    {
        this.lobbies.add(lobby);
    }

        public void setLobbies(List<Lobby> lobbies) {
        this.lobbies = lobbies;
    }
}
