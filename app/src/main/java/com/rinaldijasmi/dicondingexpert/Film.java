package com.rinaldijasmi.dicondingexpert;

import java.util.ArrayList;

public class Film {
    private static String[] judulFilm ={
            "A Star Is Born",
            "Aquaman",
            "Avenger Infinity War",
            "Bohemian Rhapsody",
            "Bumblebee",
            "Dragon: The Hidden World",
            "Dragon Ball",
            "Once Upon Deadpool",
            "Spider-Man: Into the Spider-Verse",
            "Venom"
    };

    private static String[] tanggalFilm ={
            "October 3, 2018",
            "December 7, 2018",
            "April 25, 2018",
            "October 24, 2018",
            "December 15, 2018",
            "January 3, 2019",
            "April 26, 1989",
            "December 11, 2018",
            "December 6, 2018",
            "September 28, 2018"
    };

    private static String[] descFilm ={
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            "Five years have passed since the fight with Piccolo Jr., and Goku now has a son, Gohan. The peace is interrupted when an alien named Raditz arrives on Earth in a spacecraft and tracks down Goku, revealing to him that that they are members of a near-extinct warrior race called the Saiyans.",
            "A kidnapped Fred Savage is forced to endure Deadpool's PG-13 rendition of Deadpool 2 as a Princess Bride-esque story that's full of magic, wonder & zero F's.",
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
            "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own."
    };

    private static int[] posterFilm ={
            R.drawable.poster_a_star,
            R.drawable.poster_aquaman,
            R.drawable.poster_avengerinfinity,
            R.drawable.poster_bohemian,
            R.drawable.poster_bumblebee,
            R.drawable.poster_dragon,
            R.drawable.poster_dragonball,
            R.drawable.poster_deadpool,
            R.drawable.poster_spiderman,
            R.drawable.poster_venom
    };

    static ArrayList<ItemFilm> getList() {
        ArrayList<ItemFilm> listFilm = new ArrayList<>();
        for (int position = 0; position < judulFilm.length; position++){
            ItemFilm film = new ItemFilm();
            film.setJudulFilm(judulFilm[position]);
            film.setTanggalFilm(tanggalFilm[position]);
            film.setDescFilm(descFilm[position]);
            film.setPosterFilm(posterFilm[position]);
            listFilm.add(film);
        }
        return listFilm;
    }
}
