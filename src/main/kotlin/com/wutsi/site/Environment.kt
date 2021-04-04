package com.wutsi.site

enum class Environment(public val url: String) {
  PRODUCTION("https://wutsi-site-test.herokuapp.com"),
  SANDBOX("https://wutsi-site-test.herokuapp.com")
}
