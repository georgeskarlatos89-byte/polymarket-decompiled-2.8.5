package com.socure.docv.capturesdk.common.network.model.stepup;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/Content;", "", "label", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "getType", "()I", "TEXT", "CHECKBOX", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Content {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Content[] $VALUES;
    private final String label;
    private final int type;
    public static final Content TEXT = new Content("TEXT", 0, "text", 1);
    public static final Content CHECKBOX = new Content("CHECKBOX", 1, "checkbox", 2);

    private static final /* synthetic */ Content[] $values() {
        return new Content[]{TEXT, CHECKBOX};
    }

    static {
        Content[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private Content(String str, int i, String str2, int i2) {
        this.label = str2;
        this.type = i2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static Content valueOf(String str) {
        return (Content) Enum.valueOf(Content.class, str);
    }

    public static Content[] values() {
        return (Content[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }
}
