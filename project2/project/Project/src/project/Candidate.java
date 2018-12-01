/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author mca
 */
public class Candidate {
    
   String name;
   int numVotes;
   
    public Candidate(String name){
        
        this.name = name;
        numVotes = 0;
        
    }
    
    public void addVote(){
        numVotes++;
    }
    
    public int getVotes(){
        return numVotes;
    }
}