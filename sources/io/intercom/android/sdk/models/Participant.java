package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.NameUtils;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class Participant implements Parcelable {
    public static final String ADMIN_TYPE = "admin";
    public static final String USER_TYPE = "user";
    public static final Participant NULL = create("", "", "", "", Avatar.create("", ""), Boolean.FALSE);
    public static final Parcelable.Creator<Participant> CREATOR = new Parcelable.Creator<Participant>() { // from class: io.intercom.android.sdk.models.Participant.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Participant createFromParcel(Parcel parcel) {
            boolean z;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Avatar avatar = (Avatar) parcel.readValue(Avatar.class.getClassLoader());
            if (parcel.readByte() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Participant.create(readString, readString2, readString3, readString4, avatar, Boolean.valueOf(z));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Participant[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Participant[] newArray(int i) {
            return new Participant[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Participant createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    };

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        Avatar.Builder avatar;
        String email;
        String id;
        Boolean is_bot;
        String name;
        String type;

        public Participant build() {
            String str;
            String str2;
            Avatar build;
            String str3;
            String str4 = this.type;
            if (str4 == null) {
                str4 = "user";
            }
            String str5 = str4;
            String valueOrEmpty = NullSafety.valueOrEmpty(this.name);
            String valueOrEmpty2 = NullSafety.valueOrEmpty(this.email);
            Avatar.Builder builder = this.avatar;
            if (builder != null) {
                str = builder.initials;
            } else {
                str = null;
            }
            if (NullSafety.valueOrEmpty(str).isEmpty()) {
                if (valueOrEmpty.isEmpty()) {
                    str3 = valueOrEmpty2;
                } else {
                    str3 = valueOrEmpty;
                }
                str2 = NameUtils.getInitial(str3);
            } else {
                str2 = this.avatar.initials;
            }
            Avatar.Builder builder2 = this.avatar;
            if (builder2 == null) {
                build = Avatar.create("", str2);
            } else {
                build = builder2.withInitials(str2).build();
            }
            return Participant.create(NullSafety.valueOrEmpty(this.id), valueOrEmpty, str5, valueOrEmpty2, build, Boolean.valueOf(NullSafety.valueOrDefault(this.is_bot, false)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Builder.class == obj.getClass()) {
                Builder builder = (Builder) obj;
                if (Objects.equals(this.id, builder.id) && Objects.equals(this.name, builder.name) && Objects.equals(this.type, builder.type) && Objects.equals(this.email, builder.email) && Objects.equals(this.avatar, builder.avatar) && Objects.equals(this.is_bot, builder.is_bot)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.id, this.name, this.type, this.email, this.avatar, this.is_bot);
        }

        public Builder withAvatar(Avatar.Builder builder) {
            this.avatar = builder;
            return this;
        }

        public Builder withEmail(String str) {
            this.email = str;
            return this;
        }

        public Builder withId(String str) {
            this.id = str;
            return this;
        }

        public Builder withIsBot(boolean z) {
            this.is_bot = Boolean.valueOf(z);
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }
    }

    public static Participant create(String str, String str2, String str3, String str4, Avatar avatar, Boolean bool) {
        return new AutoValue_Participant(str, str2, str3, str4, avatar, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract Avatar getAvatar();

    public abstract String getEmail();

    public String getForename() {
        return nameOrEmail().trim().split(ApiConstant.SPACE)[0];
    }

    public abstract String getId();

    public abstract String getName();

    public abstract String getType();

    public boolean isAdmin() {
        return ADMIN_TYPE.equals(getType());
    }

    public abstract Boolean isBot();

    public boolean isUserWithId(String str) {
        if ("user".equals(getType()) && getId().equals(str)) {
            return true;
        }
        return false;
    }

    public String nameOrEmail() {
        if (getName().isEmpty()) {
            return getEmail();
        }
        return getName();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getId());
        parcel.writeString(getName());
        parcel.writeString(getType());
        parcel.writeString(getEmail());
        parcel.writeValue(getAvatar());
        parcel.writeByte(isBot().booleanValue() ? (byte) 1 : (byte) 0);
    }
}
