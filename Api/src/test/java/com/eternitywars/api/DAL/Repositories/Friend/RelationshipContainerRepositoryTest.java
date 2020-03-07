package com.eternitywars.api.DAL.Repositories.Friend;

import com.eternitywars.api.DAL.Contexts.Friend.RelationshipContainerHibernateContext;
import com.eternitywars.api.Models.Entities.Relationship;
import com.eternitywars.api.Models.Entities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RelationshipContainerRepositoryTest
{
    private RelationshipContainerRepository relationshipContainerRepository = new RelationshipContainerRepository(new RelationshipContainerHibernateContext());


    @Test
    void addRelationship()
    {
        Relationship relationship = new Relationship();
        User friend = new User();
        friend.setUserId(3);
        relationship.setFriendOne(friend);
        friend.setUserId(4);
        relationship.setFriendTwo(friend);
        relationshipContainerRepository.AddRelationship(relationship);
    }

    @Test
    void deleteRelationship()
    {
        Relationship relationship = new Relationship();
        User friend = new User();
        friend.setUserId(3);
        relationship.setFriendOne(friend);
        friend.setUserId(4);
        relationshipContainerRepository.DeleteRelationship(relationship);
    }

    @Test
    void getRelationships()
    {
        User user = new User();
        user.setUserId(5);
        relationshipContainerRepository.GetRelationships(user);
        assertEquals(1, relationshipContainerRepository.GetRelationships(user).getRelationships().size());
    }
}