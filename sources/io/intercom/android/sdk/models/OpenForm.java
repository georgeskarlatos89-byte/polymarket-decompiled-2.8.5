package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.ug7;
import defpackage.ww4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/intercom/android/sdk/models/OpenForm;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OpenForm {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ OpenForm[] $VALUES;

    @SerializedName("default")
    public static final OpenForm DEFAULT = new OpenForm("DEFAULT", 0);

    private static final /* synthetic */ OpenForm[] $values() {
        return new OpenForm[]{DEFAULT};
    }

    static {
        OpenForm[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private OpenForm(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static OpenForm valueOf(String str) {
        return (OpenForm) Enum.valueOf(OpenForm.class, str);
    }

    public static OpenForm[] values() {
        return (OpenForm[]) $VALUES.clone();
    }
}
