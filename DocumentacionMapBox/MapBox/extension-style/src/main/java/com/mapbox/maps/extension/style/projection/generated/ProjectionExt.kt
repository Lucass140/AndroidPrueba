// This file is generated.
@file:JvmName("StyleProjectionUtils")

package com.mapbox.maps.extension.style.projection.generated

import com.mapbox.maps.Style
import com.mapbox.maps.StylePropertyValueKind
import com.mapbox.maps.extension.style.layers.properties.generated.ProjectionName
import com.mapbox.maps.extension.style.utils.unwrapToAny

/**
 * Extension function to get the projection provided by the Style Extension.
 *
 * @return projection [Projection] that is currently applied to the map
 */
fun Style.getProjection(): Projection {
  getStyleProjectionProperty("name").apply {
    return Projection(
      if (kind == StylePropertyValueKind.UNDEFINED) {
        ProjectionName.MERCATOR
      } else {
        val projectionAsString = value.unwrapToAny() as String
        ProjectionName.valueOf(projectionAsString.uppercase())
      }
    ).apply {
      delegate = this@getProjection
    }
  }
}

/**
 * Extension function to set the Projection provided by the Style Extension to the Style.
 *
 * @param projection The projection [Projection] to be set.
 */
fun Style.setProjection(projection: Projection) {
  projection.bindTo(this)
}

// End of generated file.