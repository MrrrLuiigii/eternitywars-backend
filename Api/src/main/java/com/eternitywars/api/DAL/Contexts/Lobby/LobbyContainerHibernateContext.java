package com.eternitywars.api.DAL.Contexts.Lobby;

import com.eternitywars.api.Interfaces.Lobby.ILobbyContainerContext;
import com.eternitywars.api.Models.Lobbies;
import com.eternitywars.api.Models.Lobby;

public class LobbyContainerHibernateContext implements ILobbyContainerContext {
    @Override
    public Lobby AddLobby(Lobby lobby)
    {
        return null;
    }

    @Override
    public boolean DeleteLobby(Lobby lobby)
    {
        return false;
    }

    @Override
    public Lobby GetLobbyById(int lobbyId)
    {
        return null;
    }

    @Override
    public Lobbies GetLobbies()
    {
        return null;
    }
//    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("eternitywars");
//    @Override
//    public Lobby AddLobby(Lobby lobby) {
//        return null;
//    }
//
//    @Override
//    public boolean DeleteLobby(Lobby lobby) {
//        return false;
//    }
//
//    @Override
//    public Lobby GetLobbyById(int lobbyId) {
//        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
//
//        Lobby returnlobby;
//
//        try {
//            returnlobby = entityManager.find(Lobby.class, lobbyId);
//        } catch (Exception ex) {
//            return null;
//        } finally {
//            entityManager.close();
//        }
//
//        return returnlobby;
//    }
//
//    @Override
//    public Lobbies GetLobbies() {
//        return null;
//    }
}
