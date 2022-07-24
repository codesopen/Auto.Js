package org.autojs.autojs.network.api

import org.autojs.autojs.network.entity.GithubReleaseInfo
import org.autojs.autojs.network.entity.GithubReleaseInfoList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubUpdateCheckApi {
    @GET("/repos/LZX284/Auto.Js/releases/latest")
    suspend fun getGithubLastReleaseInfo(): GithubReleaseInfo

    @GET("/repos/LZX284/Auto.Js/releases/tags/{tag}")
    suspend fun getGithubLastReleaseInfo(@Path("tag") tag: String): Response<GithubReleaseInfo>

    @GET("/repos/LZX284/Auto.Js/releases")
    suspend fun getGithubReleaseInfoList(): GithubReleaseInfoList
}
