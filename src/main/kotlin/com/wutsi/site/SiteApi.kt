package com.wutsi.site

import com.wutsi.site.dto.CreateSiteRequest
import com.wutsi.site.dto.CreateSiteResponse
import com.wutsi.site.dto.GetSiteResponse
import com.wutsi.site.dto.SearchSiteResponse
import com.wutsi.site.dto.SetAttributeRequest
import com.wutsi.site.dto.UpdateSiteRequest
import com.wutsi.site.dto.UpdateSiteResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface SiteApi {
  @RequestLine("GET /v1/sites/{id}")
  @Headers("Content-Type: application/json")
  public fun `get`(@Param("id") id: Long): GetSiteResponse

  @RequestLine("POST /v1/sites/{id}")
  @Headers("Content-Type: application/json")
  public fun update(@Param("id") id: Long, request: UpdateSiteRequest): UpdateSiteResponse

  @RequestLine("POST /v1/sites/{id}/attributes/{urn}")
  @Headers("Content-Type: application/json")
  public fun setAttribute(
    @Param("id") id: Long,
    @Param("urn") urn: String,
    request: SetAttributeRequest
  ): Unit

  @RequestLine("GET /v1/sites?limit={limit}&offset={offset}")
  @Headers("Content-Type: application/json")
  public fun search(@Param("limit") limit: Int = 20, @Param("offset") offset: Int = 0):
      SearchSiteResponse

  @RequestLine("POST /v1/sites")
  @Headers("Content-Type: application/json")
  public fun create(request: CreateSiteRequest): CreateSiteResponse
}
