package com.wutsi.site

enum class SiteAttribute(val urn: String) {
    BITLY_ACCESS_TOKEN("urn:attribute:wutsi:bitly:access-token"),

    EMAIL_FROM("urn:attribute:wutsi:email:from-email"),
    EMAIL_UNSUBSCRIBED_EMAIL("urn:attribute:wutsi:email:unsubscribe-email"),
    EMAIL_UNSUBSCRIBED_URL("urn:attribute:wutsi:email:unsubscribe-url"),
    EMAIL_SMALL_LOGO_URL("urn:attribute:wutsi:email:small-logo-url"),

    LINKEDIN_ENABLED("urn:attribute:wutsi:linkedin:enabled"),

    NEWSLETTER_ENABLED("urn:attribute:wutsi:newsletter:enabled"),

    PAYPAL_ENABLED("urn:attribute:wutsi:paypal:enabled"),
    PAYPAL_ENVIRONMENT("urn:attribute:wutsi:paypal:environment"),
    PAYPAL_CLIENT_ID("urn:attribute:wutsi:paypal:client-id"),
    PAYPAL_SECRET("urn:attribute:wutsi:paypal:secret"),

    TELEGRAM_ENABLED("urn:attribute:wutsi:telegram:enabled"),
    TELEGRAM_TOKEN("urn:attribute:wutsi:telegram:token"),
    TELEGRAM_CHAT_ID("urn:attribute:wutsi:telegram:chat-id"),

    TWITTER_ENABLED("urn:attribute:wutsi:twitter:enabled"),
    TWITTER_CLIENT_ID("urn:attribute:wutsi:twitter:client-id"),
    TWITTER_CLIENT_SECRET("urn:attribute:wutsi:twitter:client-secret"),
    TWITTER_USER_ID("urn:attribute:wutsi:twitter:user-id"),

    WPP_MONTHLY_AMOUNT("urn:attribute:wutsi:partner:wpp-monthly-amount"),
    WPP_THRESHOLD("urn:attribute:wutsi:partner:wpp-threshold"),
}
