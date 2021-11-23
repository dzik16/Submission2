package com.dicoding.moviecatalogue.data

import com.dicoding.moviecatalogue.R

object Data {

    fun generateDataMovie(): List<ModelMovie>{

        val movie = ArrayList<ModelMovie>()

        movie.add(ModelMovie("1",
            R.drawable.movie_alita,
        "Alita: Battle Angel (2019)",
        "Action, Science Fiction, Adventure",
        "2h 2m",
        "Robert Rodriguez",
        "70%",
        "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."))

        movie.add(ModelMovie("2",
            R.drawable.movie_bohemian,
        "Bohemian Rhapsody (2018)",
        "Music, Drama, History",
        "2h 15m",
        "Bryan Singer",
        "80%",
        "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."))

        movie.add(ModelMovie("3",
            R.drawable.movie_glass,
        "Glass (2019)",
        "Thriller, Drama, Science Fiction",
        "2h 9m",
        "M. Night Shyamalan",
        "67%",
        "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men."))

        movie.add(ModelMovie("4",
            R.drawable.movie_overlord,
        "Overlord (2018)",
        "Horror, War, Science Fiction",
        "1h 50m",
        "Julius Avery",
        "67%",
        "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else."))

        movie.add(ModelMovie("5",
            R.drawable.movie_t34,
        "T-34 (2018)",
        "War, Action, Drama, History",
        "2h 19m",
        "Alexey Sidorov",
        "80%",
        "n 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles."))

        movie.add(ModelMovie("6",
            R.drawable.movie_robin_hood,
        "Robin Hood (2018)",
        "Adventure, Action, Thriller",
        "1h 56m",
        "Otto Bathurst",
        "69%",
        "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."))

        movie.add(ModelMovie("7",
            R.drawable.movie_creed,
        "Creed II (2018)",
        "Drama",
        "2h 10m",
        "Steven Caple Jr.",
        "69%",
        "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life."))

        movie.add(ModelMovie("8",
            R.drawable.movie_infinity_war,
        "Avengers: Infinity War (2018) ",
        "Adventure, Action, Science Fiction",
        "2h 29m",
        "Joe Russo",
        "83%",
        "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."))

        movie.add(ModelMovie("9",
            R.drawable.movie_how_to_train,
        "How to Train Your Dragon: The Hidden World (2019)",
        "Animation, Family, Adventure",
        "1h 44m",
        "Dean DeBlois",
        "78%",
        "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."))

        movie.add(ModelMovie("10",
            R.drawable.movie_mortal_engines,
        "Mortal Engines (2018)",
        "Adventure, Science Fiction",
        "2h 9m",
        "Christian Rivers",
        "62%",
        "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever."))

        movie.add(ModelMovie("11",
            R.drawable.movie_end_game,
        "Avengers: Endgame (2019)",
        "Adventure, Science Fiction, Action",
        "3h 1m",
        "Anthony Russo",
        "83%",
        "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store."))

        return movie
    }


    fun generateDataTvShow(): List<ModelTvShow>{
        val tvShow = ArrayList<ModelTvShow>()

        tvShow.add(ModelTvShow("1",
            R.drawable.tvshow_doom,
        "Doom Patrol (2019)",
        "Sci-Fi & Fantasy, Drama",
        "49m",
        "Jeremy Carver",
        "77%",
        "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find."))

        tvShow.add(ModelTvShow("2",
            R.drawable.tvshow_the_flash,
        "The Flash (2014)",
        "Drama, Sci-Fi & Fantasy",
        "44m",
        "Geoff Johns",
        "78%",
        "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash."))

        tvShow.add(ModelTvShow("3",
            R.drawable.tvshow_maradona,
        "Maradona: Blessed Dream (2021)",
        "Drama, Documentar",
        "1h",
        "-",
        "78%",
        "The controversial life and history of Argentine football legend Diego Armando Maradona. From his beginnings in Villa Fiorito, one of the poorest barrios of Buenos Aires, to achieving glory on the international football league. Earning himself a well-deserved place in history. Living a life strewn with drugs, sex and public scrutiny, he played by his own rules regardless of the consequences. Watch the man who took the world by storm and made his way into the hearts of millions."))

        tvShow.add(ModelTvShow("4",
            R.drawable.tvshow_chucky,
        "Chucky (2021)",
        "Sci-Fi & Fantasy, Comedy, Crime",
        "46m",
        "Don Mancini",
        "80%",
        "After a vintage Chucky doll turns up at a suburban yard sale, an idyllic American town is thrown into chaos as a series of horrifying murders begin to expose the town’s hypocrisies and secrets. Meanwhile, the arrival of enemies — and allies — from Chucky’s past threatens to expose the truth behind the killings, as well as the demon doll’s untold origins."))

        tvShow.add(ModelTvShow("5",
            R.drawable.tvshow_dexter,
        "Dexter: New Blood (2021)",
        "Drama, Crime",
        "55m",
        "-",
        "90%",
        "10 years after Dexter went missing in the eye of Hurricane Laura, we find him living under an assumed name in the small town of Iron Lake, New York. Dexter may be embracing his new life, but in the wake of unexpected events in this close-knit community, his Dark Passenger beckons."))

        tvShow.add(ModelTvShow("6",
            R.drawable.tvshow_the_rookie,
        "The Rookie (2018)",
        "Crime, Drama",
        "43m",
        "Alexi Hawley",
        "81%",
        "Starting over isn’t easy, especially for small-town guy John Nolan who, after a life-altering incident, is pursuing his dream of being an LAPD officer. As the force’s oldest rookie, he’s met with skepticism from some higher-ups who see him as just a walking midlife crisis."))

        tvShow.add(ModelTvShow("7",
        R.drawable.tvshow_the_simpsons,
        "The Simpsons (1989)",
        "Family, Animation, Comedy",
        "22m",
        "Matt Groening",
        "79%",
        "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general."))

        tvShow.add(ModelTvShow("8",
            R.drawable.tvshow_our_lives,
        "Days of Our Lives (1965)",
        "Soap, Drama",
        "1h",
        "Irna Phillips, Ted Corday, Betty Corday",
        "63%",
        "The Horton and Brady broods endure the romantic trials of life in Salem, a Midwestern hamlet filled with evil geniuses, star-crossed lovers and a rich family history."))

        tvShow.add(ModelTvShow("9",
            R.drawable.tvshow_lucifer,
        "Lucifer (2016)",
        "Crime, Sci-Fi & Fantasy",
        "45m",
        "Tom Kapinos",
        "85%",
        "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape."))

        tvShow.add(ModelTvShow("10",
            R.drawable.tvshow_acapulco,
        "Acapulco (2021)",
        "Comedy",
        "36m",
        "Jason Shuman, Austin Winsberg, Eduardo Cisneros",
        "73%",
        "Twenty-something Máximo Gallardo's dreams comes true when he gets the job of a lifetime as a cabana boy at the hottest resort in Acapulco. He soon realizes the job is far more complicated than he ever imagined and in order to succeed, he must learn to navigate a demanding clientele, a mercurial mentor, and a complicated home life, without losing his way to shortcuts or temptations."))

        tvShow.add(ModelTvShow("11",
            R.drawable.tvshow_invasion,
        "Invasion (2021)",
        "Sci-Fi & Fantasy, Drama",
        "55m",
        "JSimon Kinberg, David Weil",
        "75%",
        "Earth is visited by an alien species that threatens humanity’s existence. Events unfold in real time through the eyes of five ordinary people across the globe as they struggle to make sense of the chaos unraveling around them."))

        return tvShow
    }

    fun detailMovie(id: Int): ModelMovie {
        return generateDataMovie()[id - 1]
    }

    fun detailTvShow(id: Int): ModelTvShow {
        return generateDataTvShow()[id - 1]
    }
}