package com.socure.docv.capturesdk.common.analytics.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014\u0012\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0014\u0012\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010J\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u001d\u0010O\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014HÆ\u0003J\u001d\u0010P\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0014HÆ\u0003J\u001d\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0014HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0019HÆ\u0003JÔ\u0001\u0010S\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00142\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00142\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020YHÖ\u0001J\t\u0010Z\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R.\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R.\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010<\"\u0004\b@\u0010>R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006["}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Document;", "", ConstantsKt.GLARE, "Lcom/socure/docv/capturesdk/common/analytics/model/Glare;", "edge", "Lcom/socure/docv/capturesdk/common/analytics/model/Edge;", ConstantsKt.BRIGHTNESS, "", ConstantsKt.BLUR, "Lcom/socure/docv/capturesdk/common/analytics/model/Blur;", "captureMode", "", "deviceId", "barcode", "Lcom/socure/docv/capturesdk/common/analytics/model/Barcode;", ConstantsKt.MRZ_TYPE, "Lcom/socure/docv/capturesdk/common/analytics/model/Mrz;", "faces", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/analytics/model/Face;", "Lkotlin/collections/ArrayList;", "variances", "", "accelerometerZValues", "sensors", "Lcom/socure/docv/capturesdk/common/analytics/model/Sensors;", "<init>", "(Lcom/socure/docv/capturesdk/common/analytics/model/Glare;Lcom/socure/docv/capturesdk/common/analytics/model/Edge;Ljava/lang/Double;Lcom/socure/docv/capturesdk/common/analytics/model/Blur;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/analytics/model/Barcode;Lcom/socure/docv/capturesdk/common/analytics/model/Mrz;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/socure/docv/capturesdk/common/analytics/model/Sensors;)V", "getGlare", "()Lcom/socure/docv/capturesdk/common/analytics/model/Glare;", "setGlare", "(Lcom/socure/docv/capturesdk/common/analytics/model/Glare;)V", "getEdge", "()Lcom/socure/docv/capturesdk/common/analytics/model/Edge;", "setEdge", "(Lcom/socure/docv/capturesdk/common/analytics/model/Edge;)V", "getBrightness", "()Ljava/lang/Double;", "setBrightness", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getBlur", "()Lcom/socure/docv/capturesdk/common/analytics/model/Blur;", "setBlur", "(Lcom/socure/docv/capturesdk/common/analytics/model/Blur;)V", "getCaptureMode", "()Ljava/lang/String;", "setCaptureMode", "(Ljava/lang/String;)V", "getDeviceId", "setDeviceId", "getBarcode", "()Lcom/socure/docv/capturesdk/common/analytics/model/Barcode;", "setBarcode", "(Lcom/socure/docv/capturesdk/common/analytics/model/Barcode;)V", "getMrz", "()Lcom/socure/docv/capturesdk/common/analytics/model/Mrz;", "setMrz", "(Lcom/socure/docv/capturesdk/common/analytics/model/Mrz;)V", "getFaces", "()Ljava/util/ArrayList;", "setFaces", "(Ljava/util/ArrayList;)V", "getVariances", "setVariances", "getAccelerometerZValues", "setAccelerometerZValues", "getSensors", "()Lcom/socure/docv/capturesdk/common/analytics/model/Sensors;", "setSensors", "(Lcom/socure/docv/capturesdk/common/analytics/model/Sensors;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/socure/docv/capturesdk/common/analytics/model/Glare;Lcom/socure/docv/capturesdk/common/analytics/model/Edge;Ljava/lang/Double;Lcom/socure/docv/capturesdk/common/analytics/model/Blur;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/analytics/model/Barcode;Lcom/socure/docv/capturesdk/common/analytics/model/Mrz;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/socure/docv/capturesdk/common/analytics/model/Sensors;)Lcom/socure/docv/capturesdk/common/analytics/model/Document;", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Document {
    public static final int $stable = 8;
    private ArrayList<Float> accelerometerZValues;
    private Barcode barcode;
    private Blur blur;
    private Double brightness;
    private String captureMode;
    private String deviceId;
    private Edge edge;
    private ArrayList<Face> faces;
    private Glare glare;
    private Mrz mrz;
    private Sensors sensors;
    private ArrayList<Float> variances;

    public /* synthetic */ Document(Glare glare, Edge edge, Double d, Blur blur, String str, String str2, Barcode barcode, Mrz mrz, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Sensors sensors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : glare, (i & 2) != 0 ? null : edge, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : blur, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : barcode, (i & 128) != 0 ? null : mrz, (i & 256) != 0 ? null : arrayList, (i & com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A) != 0 ? null : arrayList2, (i & com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_E) != 0 ? null : arrayList3, (i & 2048) != 0 ? null : sensors);
    }

    public static /* synthetic */ Document copy$default(Document document, Glare glare, Edge edge, Double d, Blur blur, String str, String str2, Barcode barcode, Mrz mrz, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Sensors sensors, int i, Object obj) {
        if ((i & 1) != 0) {
            glare = document.glare;
        }
        if ((i & 2) != 0) {
            edge = document.edge;
        }
        if ((i & 4) != 0) {
            d = document.brightness;
        }
        if ((i & 8) != 0) {
            blur = document.blur;
        }
        if ((i & 16) != 0) {
            str = document.captureMode;
        }
        if ((i & 32) != 0) {
            str2 = document.deviceId;
        }
        if ((i & 64) != 0) {
            barcode = document.barcode;
        }
        if ((i & 128) != 0) {
            mrz = document.mrz;
        }
        if ((i & 256) != 0) {
            arrayList = document.faces;
        }
        if ((i & com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A) != 0) {
            arrayList2 = document.variances;
        }
        if ((i & com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_E) != 0) {
            arrayList3 = document.accelerometerZValues;
        }
        if ((i & 2048) != 0) {
            sensors = document.sensors;
        }
        ArrayList arrayList4 = arrayList3;
        Sensors sensors2 = sensors;
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        Barcode barcode2 = barcode;
        Mrz mrz2 = mrz;
        String str3 = str;
        String str4 = str2;
        return document.copy(glare, edge, d, blur, str3, str4, barcode2, mrz2, arrayList5, arrayList6, arrayList4, sensors2);
    }

    /* renamed from: component1, reason: from getter */
    public final Glare getGlare() {
        return this.glare;
    }

    public final ArrayList<Float> component10() {
        return this.variances;
    }

    public final ArrayList<Float> component11() {
        return this.accelerometerZValues;
    }

    /* renamed from: component12, reason: from getter */
    public final Sensors getSensors() {
        return this.sensors;
    }

    /* renamed from: component2, reason: from getter */
    public final Edge getEdge() {
        return this.edge;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getBrightness() {
        return this.brightness;
    }

    /* renamed from: component4, reason: from getter */
    public final Blur getBlur() {
        return this.blur;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component7, reason: from getter */
    public final Barcode getBarcode() {
        return this.barcode;
    }

    /* renamed from: component8, reason: from getter */
    public final Mrz getMrz() {
        return this.mrz;
    }

    public final ArrayList<Face> component9() {
        return this.faces;
    }

    public final Document copy(Glare glare, Edge edge, Double brightness, Blur blur, String captureMode, String deviceId, Barcode barcode, Mrz mrz, ArrayList<Face> faces, ArrayList<Float> variances, ArrayList<Float> accelerometerZValues, Sensors sensors) {
        return new Document(glare, edge, brightness, blur, captureMode, deviceId, barcode, mrz, faces, variances, accelerometerZValues, sensors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        if (Intrinsics.areEqual(this.glare, document.glare) && Intrinsics.areEqual(this.edge, document.edge) && Intrinsics.areEqual(this.brightness, document.brightness) && Intrinsics.areEqual(this.blur, document.blur) && Intrinsics.areEqual(this.captureMode, document.captureMode) && Intrinsics.areEqual(this.deviceId, document.deviceId) && Intrinsics.areEqual(this.barcode, document.barcode) && Intrinsics.areEqual(this.mrz, document.mrz) && Intrinsics.areEqual(this.faces, document.faces) && Intrinsics.areEqual(this.variances, document.variances) && Intrinsics.areEqual(this.accelerometerZValues, document.accelerometerZValues) && Intrinsics.areEqual(this.sensors, document.sensors)) {
            return true;
        }
        return false;
    }

    public final ArrayList<Float> getAccelerometerZValues() {
        return this.accelerometerZValues;
    }

    public final Barcode getBarcode() {
        return this.barcode;
    }

    public final Blur getBlur() {
        return this.blur;
    }

    public final Double getBrightness() {
        return this.brightness;
    }

    public final String getCaptureMode() {
        return this.captureMode;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Edge getEdge() {
        return this.edge;
    }

    public final ArrayList<Face> getFaces() {
        return this.faces;
    }

    public final Glare getGlare() {
        return this.glare;
    }

    public final Mrz getMrz() {
        return this.mrz;
    }

    public final Sensors getSensors() {
        return this.sensors;
    }

    public final ArrayList<Float> getVariances() {
        return this.variances;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        Glare glare = this.glare;
        int i = 0;
        if (glare == null) {
            hashCode = 0;
        } else {
            hashCode = glare.hashCode();
        }
        int i2 = hashCode * 31;
        Edge edge = this.edge;
        if (edge == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = edge.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Double d = this.brightness;
        if (d == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Blur blur = this.blur;
        if (blur == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = blur.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str = this.captureMode;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str2 = this.deviceId;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Barcode barcode = this.barcode;
        if (barcode == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = barcode.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Mrz mrz = this.mrz;
        if (mrz == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = mrz.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        ArrayList<Face> arrayList = this.faces;
        if (arrayList == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = arrayList.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        ArrayList<Float> arrayList2 = this.variances;
        if (arrayList2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = arrayList2.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        ArrayList<Float> arrayList3 = this.accelerometerZValues;
        if (arrayList3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = arrayList3.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Sensors sensors = this.sensors;
        if (sensors != null) {
            i = sensors.hashCode();
        }
        return i12 + i;
    }

    public final void setAccelerometerZValues(ArrayList<Float> arrayList) {
        this.accelerometerZValues = arrayList;
    }

    public final void setBarcode(Barcode barcode) {
        this.barcode = barcode;
    }

    public final void setBlur(Blur blur) {
        this.blur = blur;
    }

    public final void setBrightness(Double d) {
        this.brightness = d;
    }

    public final void setCaptureMode(String str) {
        this.captureMode = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setEdge(Edge edge) {
        this.edge = edge;
    }

    public final void setFaces(ArrayList<Face> arrayList) {
        this.faces = arrayList;
    }

    public final void setGlare(Glare glare) {
        this.glare = glare;
    }

    public final void setMrz(Mrz mrz) {
        this.mrz = mrz;
    }

    public final void setSensors(Sensors sensors) {
        this.sensors = sensors;
    }

    public final void setVariances(ArrayList<Float> arrayList) {
        this.variances = arrayList;
    }

    public String toString() {
        Glare glare = this.glare;
        Edge edge = this.edge;
        Double d = this.brightness;
        Blur blur = this.blur;
        String str = this.captureMode;
        String str2 = this.deviceId;
        Barcode barcode = this.barcode;
        Mrz mrz = this.mrz;
        ArrayList<Face> arrayList = this.faces;
        ArrayList<Float> arrayList2 = this.variances;
        ArrayList<Float> arrayList3 = this.accelerometerZValues;
        Sensors sensors = this.sensors;
        StringBuilder sb = new StringBuilder("Document(glare=");
        sb.append(glare);
        sb.append(", edge=");
        sb.append(edge);
        sb.append(", brightness=");
        sb.append(d);
        sb.append(", blur=");
        sb.append(blur);
        sb.append(", captureMode=");
        k84.q(sb, str, ", deviceId=", str2, ", barcode=");
        sb.append(barcode);
        sb.append(", mrz=");
        sb.append(mrz);
        sb.append(", faces=");
        sb.append(arrayList);
        sb.append(", variances=");
        sb.append(arrayList2);
        sb.append(", accelerometerZValues=");
        sb.append(arrayList3);
        sb.append(", sensors=");
        sb.append(sensors);
        sb.append(")");
        return sb.toString();
    }

    public Document(Glare glare, Edge edge, Double d, Blur blur, String str, String str2, Barcode barcode, Mrz mrz, ArrayList<Face> arrayList, ArrayList<Float> arrayList2, ArrayList<Float> arrayList3, Sensors sensors) {
        this.glare = glare;
        this.edge = edge;
        this.brightness = d;
        this.blur = blur;
        this.captureMode = str;
        this.deviceId = str2;
        this.barcode = barcode;
        this.mrz = mrz;
        this.faces = arrayList;
        this.variances = arrayList2;
        this.accelerometerZValues = arrayList3;
        this.sensors = sensors;
    }

    public Document() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
