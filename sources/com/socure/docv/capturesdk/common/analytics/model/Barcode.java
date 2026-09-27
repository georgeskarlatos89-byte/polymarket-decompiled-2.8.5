package com.socure.docv.capturesdk.common.analytics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Barcode;", "", "barcodeDetected", "", "barcodeImage", "Lcom/socure/docv/capturesdk/common/analytics/model/BarcodeImage;", "regionData", "Lcom/socure/docv/capturesdk/common/analytics/model/RegionData;", "<init>", "(Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/common/analytics/model/BarcodeImage;Lcom/socure/docv/capturesdk/common/analytics/model/RegionData;)V", "getBarcodeDetected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBarcodeImage", "()Lcom/socure/docv/capturesdk/common/analytics/model/BarcodeImage;", "getRegionData", "()Lcom/socure/docv/capturesdk/common/analytics/model/RegionData;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/common/analytics/model/BarcodeImage;Lcom/socure/docv/capturesdk/common/analytics/model/RegionData;)Lcom/socure/docv/capturesdk/common/analytics/model/Barcode;", "equals", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Barcode {
    public static final int $stable = 8;
    private final Boolean barcodeDetected;
    private final BarcodeImage barcodeImage;
    private final RegionData regionData;

    public /* synthetic */ Barcode(Boolean bool, BarcodeImage barcodeImage, RegionData regionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : barcodeImage, (i & 4) != 0 ? null : regionData);
    }

    public static /* synthetic */ Barcode copy$default(Barcode barcode, Boolean bool, BarcodeImage barcodeImage, RegionData regionData, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = barcode.barcodeDetected;
        }
        if ((i & 2) != 0) {
            barcodeImage = barcode.barcodeImage;
        }
        if ((i & 4) != 0) {
            regionData = barcode.regionData;
        }
        return barcode.copy(bool, barcodeImage, regionData);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getBarcodeDetected() {
        return this.barcodeDetected;
    }

    /* renamed from: component2, reason: from getter */
    public final BarcodeImage getBarcodeImage() {
        return this.barcodeImage;
    }

    /* renamed from: component3, reason: from getter */
    public final RegionData getRegionData() {
        return this.regionData;
    }

    public final Barcode copy(Boolean barcodeDetected, BarcodeImage barcodeImage, RegionData regionData) {
        return new Barcode(barcodeDetected, barcodeImage, regionData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Barcode)) {
            return false;
        }
        Barcode barcode = (Barcode) other;
        if (Intrinsics.areEqual(this.barcodeDetected, barcode.barcodeDetected) && Intrinsics.areEqual(this.barcodeImage, barcode.barcodeImage) && Intrinsics.areEqual(this.regionData, barcode.regionData)) {
            return true;
        }
        return false;
    }

    public final Boolean getBarcodeDetected() {
        return this.barcodeDetected;
    }

    public final BarcodeImage getBarcodeImage() {
        return this.barcodeImage;
    }

    public final RegionData getRegionData() {
        return this.regionData;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Boolean bool = this.barcodeDetected;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        BarcodeImage barcodeImage = this.barcodeImage;
        if (barcodeImage == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = barcodeImage.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        RegionData regionData = this.regionData;
        if (regionData != null) {
            i = regionData.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "Barcode(barcodeDetected=" + this.barcodeDetected + ", barcodeImage=" + this.barcodeImage + ", regionData=" + this.regionData + ")";
    }

    public Barcode(Boolean bool, BarcodeImage barcodeImage, RegionData regionData) {
        this.barcodeDetected = bool;
        this.barcodeImage = barcodeImage;
        this.regionData = regionData;
    }

    public Barcode() {
        this(null, null, null, 7, null);
    }
}
