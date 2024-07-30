package hmju.http.tracking.models

import hmju.http.tracking.R
import hmju.http.tracking_interceptor.model.HttpBodyModel

internal data class TrackingBodyUiModel(
    val item: HttpBodyModel
) : BaseTrackingUiModel(R.layout.vh_tracking_body) {

    override fun getClassName() = "TrackingBodyUiModel"

    override fun areItemsTheSame(diffItem: Any): Boolean {
        return if (diffItem is TrackingBodyUiModel) {
            item == diffItem.item
        } else {
            false
        }
    }

    override fun areContentsTheSame(diffItem: Any): Boolean {
        return if (diffItem is TrackingBodyUiModel) {
            item == diffItem.item
        } else {
            false
        }
    }
}