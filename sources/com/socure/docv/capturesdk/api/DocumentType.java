package com.socure.docv.capturesdk.api;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/socure/docv/capturesdk/api/DocumentType;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "LICENSE", "PASSPORT", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DocumentType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ DocumentType[] $VALUES;
    public static final DocumentType LICENSE = new DocumentType("LICENSE", 0, ApiConstant.DOCUMENT_TYPE_LICENSE);
    public static final DocumentType PASSPORT = new DocumentType("PASSPORT", 1, "passport");
    private final String label;

    private static final /* synthetic */ DocumentType[] $values() {
        return new DocumentType[]{LICENSE, PASSPORT};
    }

    static {
        DocumentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private DocumentType(String str, int i, String str2) {
        this.label = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static DocumentType valueOf(String str) {
        return (DocumentType) Enum.valueOf(DocumentType.class, str);
    }

    public static DocumentType[] values() {
        return (DocumentType[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
