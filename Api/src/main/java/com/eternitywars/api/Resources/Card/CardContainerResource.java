package com.eternitywars.api.Resources.Card;

import com.eternitywars.api.DAL.Repositories.Card.CardContainerRepository;
import com.eternitywars.api.Factories.Card.CardContainerFactory;
import com.eternitywars.api.Models.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/public/card")
public class CardContainerResource
{
    private CardContainerRepository cardContainerRepository = new CardContainerRepository(CardContainerFactory.getCardContainerHibernateContext());



    @GetMapping(value = "/getByUserId/{userId}")
    public Cards GetCardsByUser(@PathVariable("userId")int userId)
    {
        return cardContainerRepository.GetCardsByUser(userId);
    }

    @GetMapping(value = "/getById/{cardId}")
    public Card GetCardsById(@PathVariable("cardId")int cardId)
    {
        return cardContainerRepository.GetCardById(cardId);
    }

    @GetMapping(value = "/get")
    public Cards GetCards()
    {
        return cardContainerRepository.GetCards();
    }

    @PostMapping(value = "/delete", consumes = "application/json", produces = "application/json")
    public boolean DeleteCard(@RequestBody Player player)
    {
        User user = new User(player.getUser().getUserId());
        Card card = player.getDeck().getCards().getCards().get(0);
        return cardContainerRepository.DeleteCard(user, card);
    }

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public boolean AddCard(@RequestBody CardAdder cardAdder)
    {
        User user = new User(cardAdder.getUserid());
        Card card = new Card(cardAdder.getCardid());
        return cardContainerRepository.AddCard(user, card);
    }
}
