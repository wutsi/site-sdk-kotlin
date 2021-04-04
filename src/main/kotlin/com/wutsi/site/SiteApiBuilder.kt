package com.wutsi.site

import com.fasterxml.jackson.databind.ObjectMapper
import feign.Feign
import feign.jackson.JacksonDecoder
import feign.jackson.JacksonEncoder
import feign.okhttp.OkHttpClient
import feign.slf4j.Slf4jLogger

class SiteApiBuilder {
  fun build(env: Environment, mapper: ObjectMapper): SiteApi {
    return Feign.builder()
      .client(OkHttpClient())
      .encoder(JacksonEncoder(mapper))
      .decoder(JacksonDecoder(mapper))
      .logger(Slf4jLogger())
      .target(SiteApi::class.java, env.url)
  }
}
