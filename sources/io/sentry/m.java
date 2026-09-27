package io.sentry;

import io.radar.sdk.RadarTrackingOptions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum m {
    All("__all__"),
    Default("default"),
    Error("error"),
    Feedback("feedback"),
    Session("session"),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    TraceMetricByte("trace_metric_byte"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay(RadarTrackingOptions.KEY_REPLAY),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    m(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
