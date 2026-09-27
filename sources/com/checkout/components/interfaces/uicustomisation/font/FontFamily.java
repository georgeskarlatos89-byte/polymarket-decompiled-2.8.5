package com.checkout.components.interfaces.uicustomisation.font;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.sv6;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "Landroid/os/Parcelable;", "Default", "Serif", "SansSerif", "Monospace", "Cursive", "Custom", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Cursive;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Custom;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Default;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Monospace;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$SansSerif;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Serif;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FontFamily implements Parcelable {
    public static final int $stable = 0;

    public FontFamily(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Cursive;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Cursive extends FontFamily {
        public static final int $stable = 0;
        public static final Cursive INSTANCE = new Cursive();
        public static final Parcelable.Creator<Cursive> CREATOR = new Creator();

        private Cursive() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other || (other instanceof Cursive)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 1703336842;
        }

        public final String toString() {
            return "Cursive";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Cursive> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cursive createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Cursive.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cursive[] newArray(int i) {
                return new Cursive[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Cursive[] newArray(int i) {
                return new Cursive[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Cursive createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Cursive.INSTANCE;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016Jb\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\rJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010\u0016¨\u00067"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Custom;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "normalFont", "normalItalicFont", "lightFont", "mediumFont", "semiBold", "boldFont", "extraBoldFont", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Custom;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getNormalFont", "b", "Ljava/lang/Integer;", "getNormalItalicFont", "c", "getLightFont", d.d, "getMediumFont", "e", "getSemiBold", "f", "getBoldFont", "g", "getExtraBoldFont", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Custom extends FontFamily {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Custom> CREATOR = new Creator();

        /* renamed from: a, reason: from kotlin metadata */
        private final int normalFont;

        /* renamed from: b, reason: from kotlin metadata */
        private final Integer normalItalicFont;

        /* renamed from: c, reason: from kotlin metadata */
        private final Integer lightFont;

        /* renamed from: d, reason: from kotlin metadata */
        private final Integer mediumFont;

        /* renamed from: e, reason: from kotlin metadata */
        private final Integer semiBold;

        /* renamed from: f, reason: from kotlin metadata */
        private final Integer boldFont;

        /* renamed from: g, reason: from kotlin metadata */
        private final Integer extraBoldFont;

        public /* synthetic */ Custom(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3, (i2 & 16) != 0 ? null : num4, (i2 & 32) != 0 ? null : num5, (i2 & 64) != 0 ? null : num6);
        }

        public static Custom copy$default(Custom custom, int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = custom.normalFont;
            }
            if ((i2 & 2) != 0) {
                num = custom.normalItalicFont;
            }
            if ((i2 & 4) != 0) {
                num2 = custom.lightFont;
            }
            if ((i2 & 8) != 0) {
                num3 = custom.mediumFont;
            }
            if ((i2 & 16) != 0) {
                num4 = custom.semiBold;
            }
            if ((i2 & 32) != 0) {
                num5 = custom.boldFont;
            }
            if ((i2 & 64) != 0) {
                num6 = custom.extraBoldFont;
            }
            Integer num7 = num6;
            custom.getClass();
            Integer num8 = num5;
            Integer num9 = num4;
            Integer num10 = num2;
            return new Custom(i, num, num10, num3, num9, num8, num7);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNormalFont() {
            return this.normalFont;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getNormalItalicFont() {
            return this.normalItalicFont;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getLightFont() {
            return this.lightFont;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getMediumFont() {
            return this.mediumFont;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getSemiBold() {
            return this.semiBold;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getBoldFont() {
            return this.boldFont;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getExtraBoldFont() {
            return this.extraBoldFont;
        }

        public final Custom copy(int normalFont, Integer normalItalicFont, Integer lightFont, Integer mediumFont, Integer semiBold, Integer boldFont, Integer extraBoldFont) {
            return new Custom(normalFont, normalItalicFont, lightFont, mediumFont, semiBold, boldFont, extraBoldFont);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            if (this.normalFont == custom.normalFont && Intrinsics.areEqual(this.normalItalicFont, custom.normalItalicFont) && Intrinsics.areEqual(this.lightFont, custom.lightFont) && Intrinsics.areEqual(this.mediumFont, custom.mediumFont) && Intrinsics.areEqual(this.semiBold, custom.semiBold) && Intrinsics.areEqual(this.boldFont, custom.boldFont) && Intrinsics.areEqual(this.extraBoldFont, custom.extraBoldFont)) {
                return true;
            }
            return false;
        }

        public final Integer getBoldFont() {
            return this.boldFont;
        }

        public final Integer getExtraBoldFont() {
            return this.extraBoldFont;
        }

        public final Integer getLightFont() {
            return this.lightFont;
        }

        public final Integer getMediumFont() {
            return this.mediumFont;
        }

        public final int getNormalFont() {
            return this.normalFont;
        }

        public final Integer getNormalItalicFont() {
            return this.normalItalicFont;
        }

        public final Integer getSemiBold() {
            return this.semiBold;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6 = Integer.hashCode(this.normalFont) * 31;
            Integer num = this.normalItalicFont;
            int i = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i2 = (hashCode6 + hashCode) * 31;
            Integer num2 = this.lightFont;
            if (num2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            Integer num3 = this.mediumFont;
            if (num3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = num3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            Integer num4 = this.semiBold;
            if (num4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = num4.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            Integer num5 = this.boldFont;
            if (num5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = num5.hashCode();
            }
            int i6 = (i5 + hashCode5) * 31;
            Integer num6 = this.extraBoldFont;
            if (num6 != null) {
                i = num6.hashCode();
            }
            return i6 + i;
        }

        public final String toString() {
            int i = this.normalFont;
            Integer num = this.normalItalicFont;
            Integer num2 = this.lightFont;
            Integer num3 = this.mediumFont;
            Integer num4 = this.semiBold;
            Integer num5 = this.boldFont;
            Integer num6 = this.extraBoldFont;
            StringBuilder sb = new StringBuilder("Custom(normalFont=");
            sb.append(i);
            sb.append(", normalItalicFont=");
            sb.append(num);
            sb.append(", lightFont=");
            sv6.z(sb, num2, ", mediumFont=", num3, ", semiBold=");
            sv6.z(sb, num4, ", boldFont=", num5, ", extraBoldFont=");
            return g.p(sb, num6, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.normalFont);
            Integer num = this.normalItalicFont;
            if (num == null) {
                dest.writeInt(0);
            } else {
                woa.z(dest, 1, num);
            }
            Integer num2 = this.lightFont;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                woa.z(dest, 1, num2);
            }
            Integer num3 = this.mediumFont;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                woa.z(dest, 1, num3);
            }
            Integer num4 = this.semiBold;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                woa.z(dest, 1, num4);
            }
            Integer num5 = this.boldFont;
            if (num5 == null) {
                dest.writeInt(0);
            } else {
                woa.z(dest, 1, num5);
            }
            Integer num6 = this.extraBoldFont;
            if (num6 == null) {
                dest.writeInt(0);
            } else {
                woa.z(dest, 1, num6);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Custom> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                Integer valueOf;
                Integer valueOf2;
                Integer valueOf3;
                Integer valueOf4;
                Integer valueOf5;
                parcel.getClass();
                int readInt = parcel.readInt();
                Integer num = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new Custom(readInt, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, num);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i) {
                return new Custom[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i) {
                return new Custom[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Custom createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public Custom(int i, Integer num) {
            this(i, num, null, null, null, null, null, 124, null);
        }

        public Custom(int i, Integer num, Integer num2) {
            this(i, num, num2, null, null, null, null, 120, null);
        }

        public Custom(int i, Integer num, Integer num2, Integer num3) {
            this(i, num, num2, num3, null, null, null, 112, null);
        }

        public Custom(int i, Integer num, Integer num2, Integer num3, Integer num4) {
            this(i, num, num2, num3, num4, null, null, 96, null);
        }

        public Custom(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
            this(i, num, num2, num3, num4, num5, null, 64, null);
        }

        public Custom(int i) {
            this(i, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        }

        public Custom(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
            super(null);
            this.normalFont = i;
            this.normalItalicFont = num;
            this.lightFont = num2;
            this.mediumFont = num3;
            this.semiBold = num4;
            this.boldFont = num5;
            this.extraBoldFont = num6;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Default;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Default extends FontFamily {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();
        public static final Parcelable.Creator<Default> CREATOR = new Creator();

        private Default() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other || (other instanceof Default)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 2121166854;
        }

        public final String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Default.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Default.INSTANCE;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Monospace;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Monospace extends FontFamily {
        public static final int $stable = 0;
        public static final Monospace INSTANCE = new Monospace();
        public static final Parcelable.Creator<Monospace> CREATOR = new Creator();

        private Monospace() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other || (other instanceof Monospace)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return -1597945720;
        }

        public final String toString() {
            return "Monospace";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Monospace> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Monospace createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Monospace.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Monospace[] newArray(int i) {
                return new Monospace[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Monospace[] newArray(int i) {
                return new Monospace[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Monospace createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Monospace.INSTANCE;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$SansSerif;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class SansSerif extends FontFamily {
        public static final int $stable = 0;
        public static final SansSerif INSTANCE = new SansSerif();
        public static final Parcelable.Creator<SansSerif> CREATOR = new Creator();

        private SansSerif() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other || (other instanceof SansSerif)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 1897341231;
        }

        public final String toString() {
            return "SansSerif";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<SansSerif> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SansSerif createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return SansSerif.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SansSerif[] newArray(int i) {
                return new SansSerif[i];
            }

            @Override // android.os.Parcelable.Creator
            public final SansSerif[] newArray(int i) {
                return new SansSerif[i];
            }

            @Override // android.os.Parcelable.Creator
            public final SansSerif createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return SansSerif.INSTANCE;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Serif;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Serif extends FontFamily {
        public static final int $stable = 0;
        public static final Serif INSTANCE = new Serif();
        public static final Parcelable.Creator<Serif> CREATOR = new Creator();

        private Serif() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other || (other instanceof Serif)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 1003780226;
        }

        public final String toString() {
            return "Serif";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Serif> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Serif createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Serif.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Serif[] newArray(int i) {
                return new Serif[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Serif[] newArray(int i) {
                return new Serif[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Serif createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Serif.INSTANCE;
            }
        }
    }
}
