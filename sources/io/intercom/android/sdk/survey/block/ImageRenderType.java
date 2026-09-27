package io.intercom.android.sdk.survey.block;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/block/ImageRenderType;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "CROPPED", "WITH_MAX_SIZE", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageRenderType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ImageRenderType[] $VALUES;
    public static final ImageRenderType FULL = new ImageRenderType("FULL", 0);
    public static final ImageRenderType CROPPED = new ImageRenderType("CROPPED", 1);
    public static final ImageRenderType WITH_MAX_SIZE = new ImageRenderType("WITH_MAX_SIZE", 2);

    private static final /* synthetic */ ImageRenderType[] $values() {
        return new ImageRenderType[]{FULL, CROPPED, WITH_MAX_SIZE};
    }

    static {
        ImageRenderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private ImageRenderType(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ImageRenderType valueOf(String str) {
        return (ImageRenderType) Enum.valueOf(ImageRenderType.class, str);
    }

    public static ImageRenderType[] values() {
        return (ImageRenderType[]) $VALUES.clone();
    }
}
