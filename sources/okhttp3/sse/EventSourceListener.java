package okhttp3.sse;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import okhttp3.Response;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J,\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0013"}, d2 = {"Lokhttp3/sse/EventSourceListener;", "", "<init>", "()V", "onOpen", "", "eventSource", "Lokhttp3/sse/EventSource;", "response", "Lokhttp3/Response;", "onEvent", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "type", ApiConstant.KEY_DATA, "onClosed", "onFailure", "t", "", "okhttp-sse"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EventSourceListener {
    public void onClosed(EventSource eventSource) {
        eventSource.getClass();
    }

    public void onEvent(EventSource eventSource, String id, String type, String data) {
        eventSource.getClass();
        data.getClass();
    }

    public void onFailure(EventSource eventSource, Throwable t, Response response) {
        eventSource.getClass();
    }

    public void onOpen(EventSource eventSource, Response response) {
        eventSource.getClass();
        response.getClass();
    }
}
