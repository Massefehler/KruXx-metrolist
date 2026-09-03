package com.metrolist.innertube.models

import kotlinx.serialization.Serializable

@Serializable
data class Thumbnails(
    // YouTube Music occasionally returns an empty `thumbnail` object for
    // library entries. Treat that as "no artwork" instead of rejecting the
    // complete browse response.
    val thumbnails: List<Thumbnail> = emptyList(),
)

@Serializable
data class Thumbnail(
    val url: String,
    val width: Int?,
    val height: Int?,
)
