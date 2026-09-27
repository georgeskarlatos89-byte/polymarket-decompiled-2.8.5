package com.socure.docv.capturesdk.common.analytics.model;

import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/BarcodeImage;", "", "any", "<init>", "(Ljava/lang/Object;)V", "getAny", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BarcodeImage {
    public static final int $stable = 8;
    private final Object any;

    public /* synthetic */ BarcodeImage(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    public static /* synthetic */ BarcodeImage copy$default(BarcodeImage barcodeImage, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = barcodeImage.any;
        }
        return barcodeImage.copy(obj);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getAny() {
        return this.any;
    }

    public final BarcodeImage copy(Object any) {
        return new BarcodeImage(any);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof BarcodeImage) && Intrinsics.areEqual(this.any, ((BarcodeImage) other).any)) {
            return true;
        }
        return false;
    }

    public final Object getAny() {
        return this.any;
    }

    public int hashCode() {
        Object obj = this.any;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return woa.o("BarcodeImage(any=", this.any, ")");
    }

    public BarcodeImage(Object obj) {
        this.any = obj;
    }

    public BarcodeImage() {
        this(null, 1, null);
    }
}
