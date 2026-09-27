package io.getstream.chat.android.models.streamcdn.image;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;", "", "queryParameterName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getQueryParameterName", "()Ljava/lang/String;", "CLIP", "CROP", "FILL", "SCALE", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamCdnResizeImageMode {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ StreamCdnResizeImageMode[] $VALUES;
    public static final StreamCdnResizeImageMode CLIP = new StreamCdnResizeImageMode("CLIP", 0, "clip");
    public static final StreamCdnResizeImageMode CROP = new StreamCdnResizeImageMode("CROP", 1, "crop");
    public static final StreamCdnResizeImageMode FILL = new StreamCdnResizeImageMode("FILL", 2, "fill");
    public static final StreamCdnResizeImageMode SCALE = new StreamCdnResizeImageMode("SCALE", 3, "scale");
    private final String queryParameterName;

    private static final /* synthetic */ StreamCdnResizeImageMode[] $values() {
        return new StreamCdnResizeImageMode[]{CLIP, CROP, FILL, SCALE};
    }

    static {
        StreamCdnResizeImageMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private StreamCdnResizeImageMode(String str, int i, String str2) {
        this.queryParameterName = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static StreamCdnResizeImageMode valueOf(String str) {
        return (StreamCdnResizeImageMode) Enum.valueOf(StreamCdnResizeImageMode.class, str);
    }

    public static StreamCdnResizeImageMode[] values() {
        return (StreamCdnResizeImageMode[]) $VALUES.clone();
    }

    public final String getQueryParameterName() {
        return this.queryParameterName;
    }
}
