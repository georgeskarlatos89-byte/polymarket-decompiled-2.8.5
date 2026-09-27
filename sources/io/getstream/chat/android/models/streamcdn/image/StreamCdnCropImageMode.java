package io.getstream.chat.android.models.streamcdn.image;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;", "", "queryParameterName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getQueryParameterName", "()Ljava/lang/String;", "TOP", "BOTTOM", "RIGHT", "LEFT", "CENTER", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamCdnCropImageMode {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ StreamCdnCropImageMode[] $VALUES;
    private final String queryParameterName;
    public static final StreamCdnCropImageMode TOP = new StreamCdnCropImageMode("TOP", 0, VerticalAlignment.TOP);
    public static final StreamCdnCropImageMode BOTTOM = new StreamCdnCropImageMode("BOTTOM", 1, VerticalAlignment.BOTTOM);
    public static final StreamCdnCropImageMode RIGHT = new StreamCdnCropImageMode("RIGHT", 2, BlockAlignment.RIGHT);
    public static final StreamCdnCropImageMode LEFT = new StreamCdnCropImageMode("LEFT", 3, BlockAlignment.LEFT);
    public static final StreamCdnCropImageMode CENTER = new StreamCdnCropImageMode("CENTER", 4, "center");

    private static final /* synthetic */ StreamCdnCropImageMode[] $values() {
        return new StreamCdnCropImageMode[]{TOP, BOTTOM, RIGHT, LEFT, CENTER};
    }

    static {
        StreamCdnCropImageMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private StreamCdnCropImageMode(String str, int i, String str2) {
        this.queryParameterName = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static StreamCdnCropImageMode valueOf(String str) {
        return (StreamCdnCropImageMode) Enum.valueOf(StreamCdnCropImageMode.class, str);
    }

    public static StreamCdnCropImageMode[] values() {
        return (StreamCdnCropImageMode[]) $VALUES.clone();
    }

    public final String getQueryParameterName() {
        return this.queryParameterName;
    }
}
