package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ConversationRatingOption implements Parcelable {
    public static final Parcelable.Creator<ConversationRatingOption> CREATOR = new Parcelable.Creator<ConversationRatingOption>() { // from class: io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRatingOption createFromParcel(Parcel parcel) {
            return new ConversationRatingOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationRatingOption[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRatingOption[] newArray(int i) {
            return new ConversationRatingOption[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationRatingOption createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    };
    private final String emoji;
    private final int index;
    private final String unicode;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        String emoji;
        Integer index;
        String unicode;

        public ConversationRatingOption build() {
            return new ConversationRatingOption(this, null);
        }

        public Builder withEmoji(String str) {
            this.emoji = str;
            return this;
        }

        public Builder withIndex(Integer num) {
            this.index = num;
            return this;
        }

        public Builder withUnicode(String str) {
            this.unicode = str;
            return this;
        }
    }

    private ConversationRatingOption(Builder builder) {
        int intValue;
        Integer num = builder.index;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        this.index = intValue;
        String str = builder.emoji;
        this.emoji = str == null ? "" : str;
        String str2 = builder.unicode;
        this.unicode = str2 != null ? str2 : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConversationRatingOption conversationRatingOption = (ConversationRatingOption) obj;
            if (this.index != conversationRatingOption.index) {
                return false;
            }
            String str = this.emoji;
            String str2 = conversationRatingOption.emoji;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.unicode;
            String str4 = conversationRatingOption.unicode;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public String getEmoji() {
        return this.emoji;
    }

    public Integer getIndex() {
        return Integer.valueOf(this.index);
    }

    public String getUnicode() {
        return this.unicode;
    }

    public int hashCode() {
        int i;
        int i2 = this.index * 31;
        String str = this.emoji;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.unicode;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.emoji);
        parcel.writeString(this.unicode);
    }

    public /* synthetic */ ConversationRatingOption(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public ConversationRatingOption(Parcel parcel) {
        this.index = parcel.readInt();
        this.emoji = parcel.readString();
        this.unicode = parcel.readString();
    }
}
