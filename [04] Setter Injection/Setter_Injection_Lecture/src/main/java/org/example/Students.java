package org.example;

public class Students {

/*
* POJO class from which we will be creating a bean that will be using another bean as a reference type.
* */
    private Scores scores;

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Students{" +
                "scores=" + scores +
                '}';
    }
}
