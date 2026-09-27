package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ConversationRating implements Parcelable {
    public static final Parcelable.Creator<ConversationRating> CREATOR = new Parcelable.Creator<ConversationRating>() { // from class: io.intercom.android.sdk.blocks.lib.models.ConversationRating.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRating createFromParcel(Parcel parcel) {
            return new ConversationRating(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationRating[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRating[] newArray(int i) {
            return new ConversationRating[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationRating createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    };
    private final List<ConversationRatingOption> options;
    private int ratingIndex;
    private String remark;

    public ConversationRating(Parcel parcel) {
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
    }

    public static ConversationRating fromBlock(Block block) {
        if (block == null) {
            return new ConversationRating(-1, "", new ArrayList());
        }
        return new ConversationRating(block.getRatingIndex(), block.getRemark(), block.getOptions());
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
            ConversationRating conversationRating = (ConversationRating) obj;
            if (this.ratingIndex != conversationRating.ratingIndex) {
                return false;
            }
            String str = this.remark;
            String str2 = conversationRating.remark;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            List<ConversationRatingOption> list = this.options;
            List<ConversationRatingOption> list2 = conversationRating.options;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public Integer getRatingIndex() {
        return Integer.valueOf(this.ratingIndex);
    }

    public String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        int i;
        int i2 = this.ratingIndex * 31;
        String str = this.remark;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        List<ConversationRatingOption> list = this.options;
        if (list != null) {
            i3 = list.hashCode();
        }
        return i4 + i3;
    }

    public void setRatingIndex(int i) {
        this.ratingIndex = i;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeList(this.options);
    }

    public ConversationRating(int i, String str, List<ConversationRatingOption> list) {
        this.ratingIndex = i;
        this.remark = str;
        this.options = list;
    }
}
