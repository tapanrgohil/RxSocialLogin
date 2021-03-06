package com.github.windsekirun.rxsociallogin.disqus

import com.github.windsekirun.rxsociallogin.intenal.impl.ConfigFunction
import com.github.windsekirun.rxsociallogin.intenal.oauth.OAuthConfig

class DisqusConfig : OAuthConfig() {
    companion object {
        internal fun apply(clientId: String, clientSecret: String, redirectUri: String,
                           setup: ConfigFunction<DisqusConfig>? = null): DisqusConfig {
            val config = DisqusConfig().apply {
                this.clientId = clientId
                this.clientSecret = clientSecret
                this.redirectUri = redirectUri
            }

            setup?.invoke(config)

            return config
        }
    }
}