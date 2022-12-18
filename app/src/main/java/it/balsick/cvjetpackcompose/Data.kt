package it.balsick.cvjetpackcompose

import com.guru.fontawesomecomposelib.FaIcons
import it.balsick.cvjetpackcompose.data.*

object Data {
    // Sample conversation data
    var skills = listOf(
        "java",
        "react",
        "vue.js",
        "aws",
        "node.js",
        "spring",
        "docker",
        "npm",
        "postgres",
        "firebase",
        "influx",
        "redis"
    )

    var personalInfo = listOf(
        PersonalInfo(
            icon = FaIcons.BirthdayCake,
            text = "December 03, 1992"
        ), PersonalInfo(
            icon = FaIcons.At,
            text = "balsick@gmail.com"
        ), PersonalInfo(
            icon = FaIcons.LocationArrow,
            text = "Torino (TO) - Italy"
        ), PersonalInfo(
            icon = FaIcons.Mobile,
            text = "+39 340 14 66 912"
        ), PersonalInfo(
            icon = FaIcons.Github,
            text = "balsick"
        ), PersonalInfo(
            icon = FaIcons.StackOverflow,
            text = "user:2331491"
        )
    )

    var studies = listOf(
        Study(
            2018,
            "Master's Degree in Computer Engineering"
        ), Study(
            2014,
            "Bachelor's Degree in Computer Engineering"
        )
    )

    var languages = listOf(
        Language(
            "Italian", "Native speaker"
        ),
        Language(
            "English", "Fluent"
        )
    )

    var passions = listOf(
        Passion(
            icon = FaIcons.BookOpen,
            text = "Reading (find me on Goodreads)"
        ), Passion(
            icon = FaIcons.Swimmer,
            text = "Swimming, running, trekking, working out"
        ), Passion(
            icon = FaIcons.FootballBall,
            text = "Watching sports"
        ), Passion(
            icon = FaIcons.Tv,
            text = "Movies and TV shows"
        )
    )

    var experiences = listOf(
        Experience(
            title = "Freelance",
            since = "2022",
            description = "I have started helping companies speed up the development of their projects",
            projects = listOf(
                "Front-end web development (Vue.js) on a B2B / B2C italian food delivery project."
            )
        ), Experience(
            title = "Software Architect @ AEC Soluzioni srl",
            since = "February, 2015",
            projects = listOf(
                "2022 - Design and development of JPiano® Edge, an automatically deployed environment (Docker + node.js) " +
                        "for starting and managing uncoupled containers for field communication",
                "2022 - Design and development of JPiano® Logistics, a JPiano® Web version for companies that only move goods without producing it",
                "2021 - Design and development of JPiano® Field Edge, a lightweight version of JPiano® for communicating with plants and storing data on Cloud",
                "2021 - Design and development of JPiano® Cloud, a cloud set of components for letting small companies use JPiano® in a shared multi-tenant environment",
                "2020 - Joined the JPiano® Server development team",
                "2019 - Design and development from scratch of JPiano® Mobile (React-Native) for logistics, BI and notifications",
                "2018 - Migrating the JPiano® Web application from SpringMVC + JSP + jquery-mobile to a Spring Boot served Single Page Application",
                "2017 - Design and development from scratch of JPiano® Native Android Wear application for receiving notifications from on-premise JPiano® installations without the usage of public endpoints for registration",
                "2017 - Improved JPiano® client Java Swing application for handling multiple open functions concurrently and converted it from being single-threaded to multi-threaded",
                "2017 - Joined the JPiano® Client and Framework development teams",
                "2015 ~ 2016 - Software development of a scheduler for tasks, orders, projects and WBS for companies using JPiano®"
            )
        )
    )
}