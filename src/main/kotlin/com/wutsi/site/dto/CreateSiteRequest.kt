package com.wutsi.site.dto

import kotlin.String

public data class CreateSiteRequest(
  public val name: String = "",
  public val domainName: String = "",
  public val displayName: String = "",
  public val language: String = "",
  public val currency: String = "",
  public val internationalCurrency: String = ""
)
