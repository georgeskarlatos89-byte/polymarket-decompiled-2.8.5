package com.socure.docv.capturesdk.common.config.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/socure/docv/capturesdk/common/config/model/ModelConfig;", "Landroid/os/Parcelable;", "path", "", "confidence", "", "type", "Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;)V", "getPath", "()Ljava/lang/String;", "getConfidence", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getType", "()Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Float;Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;)Lcom/socure/docv/capturesdk/common/config/model/ModelConfig;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Type", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ModelConfig implements Parcelable {
    private final Float confidence;
    private final String path;
    private final Type type;
    public static final Parcelable.Creator<ModelConfig> CREATOR = new Creator();
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "", "<init>", "(Ljava/lang/String;I)V", "BLUR", "CORNER", "GLARE", "GLARE_INTENSITY", "UNKNOWN", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BLUR = new Type("BLUR", 0);
        public static final Type CORNER = new Type("CORNER", 1);
        public static final Type GLARE = new Type("GLARE", 2);
        public static final Type GLARE_INTENSITY = new Type("GLARE_INTENSITY", 3);
        public static final Type UNKNOWN = new Type("UNKNOWN", 4);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{BLUR, CORNER, GLARE, GLARE_INTENSITY, UNKNOWN};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
        }

        private Type(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ModelConfig(String str, Float f, Type type) {
        type.getClass();
        this.path = str;
        this.confidence = f;
        this.type = type;
    }

    public static /* synthetic */ ModelConfig copy$default(ModelConfig modelConfig, String str, Float f, Type type, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelConfig.path;
        }
        if ((i & 2) != 0) {
            f = modelConfig.confidence;
        }
        if ((i & 4) != 0) {
            type = modelConfig.type;
        }
        return modelConfig.copy(str, f, type);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getConfidence() {
        return this.confidence;
    }

    /* renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final ModelConfig copy(String path, Float confidence, Type type) {
        type.getClass();
        return new ModelConfig(path, confidence, type);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelConfig)) {
            return false;
        }
        ModelConfig modelConfig = (ModelConfig) other;
        if (Intrinsics.areEqual(this.path, modelConfig.path) && Intrinsics.areEqual(this.confidence, modelConfig.confidence) && this.type == modelConfig.type) {
            return true;
        }
        return false;
    }

    public final Float getConfidence() {
        return this.confidence;
    }

    public final String getPath() {
        return this.path;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        String str = this.path;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Float f = this.confidence;
        if (f != null) {
            i = f.hashCode();
        }
        return this.type.hashCode() + ((i2 + i) * 31);
    }

    public String toString() {
        return "ModelConfig(path=" + this.path + ", confidence=" + this.confidence + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.path);
        Float f = this.confidence;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
        }
        dest.writeString(this.type.name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<ModelConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModelConfig createFromParcel(Parcel parcel) {
            Float valueOf;
            parcel.getClass();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Float.valueOf(parcel.readFloat());
            }
            return new ModelConfig(readString, valueOf, Type.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ModelConfig[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModelConfig[] newArray(int i) {
            return new ModelConfig[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ModelConfig createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }
}
