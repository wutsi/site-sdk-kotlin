package com.wutsi.site

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-site-test.herokuapp.com"),
  PRODUCTION("https://wutsi-site-prod.herokuapp.com"),
  ;
}
