package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import com.google.gson.annotations.SerializedName;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.hdi;
import defpackage.m51;
import defpackage.pxl;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jl\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020)H\u0007J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,H×\u0003J\t\u0010-\u001a\u00020)H×\u0001J\t\u0010.\u001a\u00020\u0003H×\u0001J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u00064"}, d2 = {"Lio/intercom/android/sdk/models/Attribute;", "Landroid/os/Parcelable;", "identifier", "", Keys.KEY_NAME, "type", MetricTracker.Action.SUBMITTED, "", "customBotControlId", "options", "", "multiline", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getName", "getType", "getSubmitted", "()Z", "getCustomBotControlId", "getOptions", "()Ljava/util/List;", "getMultiline", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getValue", "hasValue", "getRenderType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lio/intercom/android/sdk/models/Attribute;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Attribute implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Attribute> CREATOR = new Creator();

    @SerializedName("custom_bot_control_id")
    private final String customBotControlId;

    @SerializedName("identifier")
    private final String identifier;

    @SerializedName("multiline")
    private final Boolean multiline;

    @SerializedName(Keys.KEY_NAME)
    private final String name;

    @SerializedName("options")
    private final List<String> options;

    @SerializedName(MetricTracker.Action.SUBMITTED)
    private final boolean submitted;

    @SerializedName("type")
    private final String type;

    @SerializedName("value")
    private final String value;

    public /* synthetic */ Attribute(String str, String str2, String str3, boolean z, String str4, List list, Boolean bool, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str5);
    }

    public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, String str3, boolean z, String str4, List list, Boolean bool, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attribute.identifier;
        }
        if ((i & 2) != 0) {
            str2 = attribute.name;
        }
        if ((i & 4) != 0) {
            str3 = attribute.type;
        }
        if ((i & 8) != 0) {
            z = attribute.submitted;
        }
        if ((i & 16) != 0) {
            str4 = attribute.customBotControlId;
        }
        if ((i & 32) != 0) {
            list = attribute.options;
        }
        if ((i & 64) != 0) {
            bool = attribute.multiline;
        }
        if ((i & 128) != 0) {
            str5 = attribute.value;
        }
        Boolean bool2 = bool;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        return attribute.copy(str, str2, str3, z, str7, list2, bool2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSubmitted() {
        return this.submitted;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomBotControlId() {
        return this.customBotControlId;
    }

    public final List<String> component6() {
        return this.options;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getMultiline() {
        return this.multiline;
    }

    /* renamed from: component8, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final Attribute copy(String identifier, String name, String type, boolean submitted, String customBotControlId, List<String> options, Boolean multiline, String value) {
        identifier.getClass();
        name.getClass();
        type.getClass();
        return new Attribute(identifier, name, type, submitted, customBotControlId, options, multiline, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) other;
        if (Intrinsics.areEqual(this.identifier, attribute.identifier) && Intrinsics.areEqual(this.name, attribute.name) && Intrinsics.areEqual(this.type, attribute.type) && this.submitted == attribute.submitted && Intrinsics.areEqual(this.customBotControlId, attribute.customBotControlId) && Intrinsics.areEqual(this.options, attribute.options) && Intrinsics.areEqual(this.multiline, attribute.multiline) && Intrinsics.areEqual(this.value, attribute.value)) {
            return true;
        }
        return false;
    }

    public final String getCustomBotControlId() {
        return this.customBotControlId;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Boolean getMultiline() {
        return this.multiline;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final String getRenderType() {
        String str = this.type;
        switch (str.hashCode()) {
            case -891985903:
                if (!str.equals("string")) {
                    return "unknown";
                }
                List<String> list = this.options;
                if (list != null && !list.isEmpty()) {
                    return AttributeType.LIST;
                }
                String str2 = this.identifier;
                int hashCode = str2.hashCode();
                if (hashCode != 75849770) {
                    if (hashCode != 96619420) {
                        if (hashCode != 106642798 || !str2.equals(AttributeType.PHONE)) {
                            return "text";
                        }
                    } else if (!str2.equals("email")) {
                        return "text";
                    }
                } else if (!str2.equals(AttributeType.WEBSITE)) {
                    return "text";
                }
                return this.identifier;
            case 3076014:
                if (str.equals(AttributeType.DATE)) {
                    return AttributeType.DATE;
                }
                return "unknown";
            case 64711720:
                if (str.equals(AttributeType.BOOLEAN)) {
                    return AttributeType.BOOLEAN;
                }
                return "unknown";
            case 97526364:
                if (str.equals(AttributeType.FLOAT)) {
                    return AttributeType.FLOAT;
                }
                return "unknown";
            case 1958052158:
                if (str.equals(AttributeType.INTEGER)) {
                    return AttributeType.NUMBER;
                }
                return "unknown";
            default:
                return "unknown";
        }
    }

    public final boolean getSubmitted() {
        return this.submitted;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean hasValue() {
        boolean z;
        String str = this.value;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int g = hdi.g(hdi.e(hdi.e(this.identifier.hashCode() * 31, 31, this.name), 31, this.type), 31, this.submitted);
        String str = this.customBotControlId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (g + hashCode) * 31;
        List<String> list = this.options;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.multiline;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Attribute(identifier=");
        sb.append(this.identifier);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", submitted=");
        sb.append(this.submitted);
        sb.append(", customBotControlId=");
        sb.append(this.customBotControlId);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", multiline=");
        sb.append(this.multiline);
        sb.append(", value=");
        return m51.m(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.identifier);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeInt(this.submitted ? 1 : 0);
        dest.writeString(this.customBotControlId);
        dest.writeStringList(this.options);
        Boolean bool = this.multiline;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            pxl.i(dest, 1, bool);
        }
        dest.writeString(this.value);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Attribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String readString4 = parcel.readString();
            boolean z4 = z2;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = z4;
                }
                valueOf = Boolean.valueOf(z);
            }
            return new Attribute(readString, readString2, readString3, z3, readString4, createStringArrayList, valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Attribute[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute[] newArray(int i) {
            return new Attribute[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Attribute createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    public Attribute(String str, String str2, String str3, boolean z, String str4, List<String> list, Boolean bool, String str5) {
        g.x(str, str2, str3);
        this.identifier = str;
        this.name = str2;
        this.type = str3;
        this.submitted = z;
        this.customBotControlId = str4;
        this.options = list;
        this.multiline = bool;
        this.value = str5;
    }
}
