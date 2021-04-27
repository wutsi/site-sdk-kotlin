package com.wutsi.site.dto

import kotlin.String

public data class UpdateSiteRequest(
  public val name: String = "",
  public val domainName: String = "",
  public val displayName: String = "",
  public val language: String = "",
  public val currency: String = ""
)
