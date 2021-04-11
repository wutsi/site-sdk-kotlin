package com.wutsi.site

import com.wutsi.site.dto.CreateSiteRequest
import com.wutsi.site.dto.CreateSiteResponse
import com.wutsi.site.dto.GetSiteResponse
import com.wutsi.site.dto.SetAttributeRequest
import com.wutsi.site.dto.UpdateSiteRequest
import com.wutsi.site.dto.UpdateSiteResponse
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface SiteApi {
  @RequestLine("GET /v1/sites/{id}")
  public fun `get`(@Param("id") id: Long): GetSiteResponse

  @RequestLine("POST /v1/sites/{id}")
  public fun update(@Param("id") id: Long, request: UpdateSiteRequest): UpdateSiteResponse

  @RequestLine("POST /v1/sites/{id}/attributes/{urn}")
  public fun setAttribute(
    @Param("id") id: Long,
    @Param("urn") urn: String,
    request: SetAttributeRequest
  ): Unit

  @RequestLine("POST /v1/sites")
  public fun create(request: CreateSiteRequest): CreateSiteResponse
}
