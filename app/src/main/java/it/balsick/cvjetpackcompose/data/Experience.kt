package it.balsick.cvjetpackcompose.data

data class Experience(var title: String,
                      var since: String,
                      var description: String? = null,
                      var projects: List<String>
                      )
