package com.checkout.components.interfaces.uicustomisation.designtoken;

import android.os.Parcel;
import android.os.Parcelable;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontName;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.sv6;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010\u0010J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018R'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u001c¨\u00064"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "Landroid/os/Parcelable;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;", "colorTokens", "", "Lcom/checkout/components/interfaces/uicustomisation/font/FontName;", "Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "Lcom/checkout/components/interfaces/uicustomisation/font/Fonts;", "fonts", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "borderFormRadius", "borderButtonRadius", "<init>", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "component4", "copy", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;)Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;", "getColorTokens", "b", "Ljava/util/Map;", "getFonts", "c", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "getBorderFormRadius", d.d, "getBorderButtonRadius", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DesignTokens implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DesignTokens> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    private final ColorTokens colorTokens;

    /* renamed from: b, reason: from kotlin metadata */
    private final Map fonts;

    /* renamed from: c, reason: from kotlin metadata */
    private final BorderRadius borderFormRadius;

    /* renamed from: d, reason: from kotlin metadata */
    private final BorderRadius borderButtonRadius;

    public DesignTokens(ColorTokens colorTokens, Map<FontName, Font> map, BorderRadius borderRadius, BorderRadius borderRadius2) {
        colorTokens.getClass();
        map.getClass();
        borderRadius.getClass();
        borderRadius2.getClass();
        this.colorTokens = colorTokens;
        this.fonts = map;
        this.borderFormRadius = borderRadius;
        this.borderButtonRadius = borderRadius2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DesignTokens copy$default(DesignTokens designTokens, ColorTokens colorTokens, Map map, BorderRadius borderRadius, BorderRadius borderRadius2, int i, Object obj) {
        if ((i & 1) != 0) {
            colorTokens = designTokens.colorTokens;
        }
        if ((i & 2) != 0) {
            map = designTokens.fonts;
        }
        if ((i & 4) != 0) {
            borderRadius = designTokens.borderFormRadius;
        }
        if ((i & 8) != 0) {
            borderRadius2 = designTokens.borderButtonRadius;
        }
        return designTokens.copy(colorTokens, map, borderRadius, borderRadius2);
    }

    /* renamed from: component1, reason: from getter */
    public final ColorTokens getColorTokens() {
        return this.colorTokens;
    }

    public final Map<FontName, Font> component2() {
        return this.fonts;
    }

    /* renamed from: component3, reason: from getter */
    public final BorderRadius getBorderFormRadius() {
        return this.borderFormRadius;
    }

    /* renamed from: component4, reason: from getter */
    public final BorderRadius getBorderButtonRadius() {
        return this.borderButtonRadius;
    }

    public final DesignTokens copy(ColorTokens colorTokens, Map<FontName, Font> fonts, BorderRadius borderFormRadius, BorderRadius borderButtonRadius) {
        colorTokens.getClass();
        fonts.getClass();
        borderFormRadius.getClass();
        borderButtonRadius.getClass();
        return new DesignTokens(colorTokens, fonts, borderFormRadius, borderButtonRadius);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesignTokens)) {
            return false;
        }
        DesignTokens designTokens = (DesignTokens) other;
        if (Intrinsics.areEqual(this.colorTokens, designTokens.colorTokens) && Intrinsics.areEqual(this.fonts, designTokens.fonts) && Intrinsics.areEqual(this.borderFormRadius, designTokens.borderFormRadius) && Intrinsics.areEqual(this.borderButtonRadius, designTokens.borderButtonRadius)) {
            return true;
        }
        return false;
    }

    public final BorderRadius getBorderButtonRadius() {
        return this.borderButtonRadius;
    }

    public final BorderRadius getBorderFormRadius() {
        return this.borderFormRadius;
    }

    public final ColorTokens getColorTokens() {
        return this.colorTokens;
    }

    public final Map<FontName, Font> getFonts() {
        return this.fonts;
    }

    public final int hashCode() {
        return this.borderButtonRadius.hashCode() + ((this.borderFormRadius.hashCode() + sv6.c(this.fonts, this.colorTokens.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "DesignTokens(colorTokens=" + this.colorTokens + ", fonts=" + this.fonts + ", borderFormRadius=" + this.borderFormRadius + ", borderButtonRadius=" + this.borderButtonRadius + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        this.colorTokens.writeToParcel(dest, flags);
        Map map = this.fonts;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            FontName fontName = (FontName) entry.getKey();
            fontName.getClass();
            dest.writeString(fontName.name());
            ((Font) entry.getValue()).writeToParcel(dest, flags);
        }
        this.borderFormRadius.writeToParcel(dest, flags);
        this.borderButtonRadius.writeToParcel(dest, flags);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<DesignTokens> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DesignTokens createFromParcel(Parcel parcel) {
            parcel.getClass();
            ColorTokens createFromParcel = ColorTokens.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(FontName.CREATOR.createFromParcel(parcel), Font.CREATOR.createFromParcel(parcel));
            }
            Parcelable.Creator<BorderRadius> creator = BorderRadius.CREATOR;
            return new DesignTokens(createFromParcel, linkedHashMap, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DesignTokens[] newArray(int i) {
            return new DesignTokens[i];
        }

        @Override // android.os.Parcelable.Creator
        public final DesignTokens[] newArray(int i) {
            return new DesignTokens[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DesignTokens createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }
}
