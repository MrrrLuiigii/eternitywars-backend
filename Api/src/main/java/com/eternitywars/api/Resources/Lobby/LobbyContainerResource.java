package com.eternitywars.api.Resources.Lobby;

import com.eternitywars.api.DAL.Repositories.Lobby.LobbyContainerRepository;
import com.eternitywars.api.Factories.Lobby.LobbyContainerFactory;
import com.eternitywars.api.Factories.Lobby.LobbyFactory;
import com.eternitywars.api.Models.Lobby;
import com.eternitywars.api.Models.Lobbies;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/public/lobby")
public class LobbyContainerResource
{
    private LobbyContainerRepository lobbyContainerRepository = new LobbyContainerRepository(LobbyContainerFactory.getLobbyContainerHibernateContext());

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Lobby AddLobby(@RequestBody Lobby lobby)
    {
        return lobbyContainerRepository.AddLobby(lobby);
    }

    @DeleteMapping(value = "/delete", consumes = "application/json", produces = "application/json")
    public boolean DeleteLobby(@RequestBody Lobby lobby)
    {
        return lobbyContainerRepository.DeleteLobby(lobby);
    }

    @GetMapping(value = "/getById/{lobbyId}")
    public Lobby GetLobbyById(@PathVariable("lobbyId")int lobbyId)
    {
        return lobbyContainerRepository.GetLobbyById(lobbyId);
    }

    @GetMapping(value = "/get")
    public Lobbies GetLobbies()
    {
        return lobbyContainerRepository.GetLobbies();
    }
}
