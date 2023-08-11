package hmju.http.tracking.models

import com.http.tracking.R
import hmju.http.tracking_interceptor.model.HttpTrackingModel

internal data class TrackingListDefaultUiModel(
    val item: HttpTrackingModel.Default
) : BaseTrackingUiModel(R.layout.vh_child_tracking) {
    override fun getClassName(): String {
        return "TrackingListV2UiModel"
    }

    override fun areItemsTheSame(diffItem: Any): Boolean {
        return if (diffItem is TrackingListDefaultUiModel) {
            item.uid == diffItem.item.uid
        } else {
            false
        }
    }

    override fun areContentsTheSame(diffItem: Any): Boolean {
        return if (diffItem is TrackingListDefaultUiModel) {
            item.uid == diffItem.item.uid
        } else {
            false
        }
    }
}
