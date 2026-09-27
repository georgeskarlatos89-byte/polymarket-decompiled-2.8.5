package io.intercom.android.sdk.helpcenter.articles;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hdi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000fH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleStatsArguments;", "Landroid/os/Parcelable;", "articleId", "", "isFromSearchBrowse", "", "<init>", "(Ljava/lang/String;Z)V", "getArticleId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ArticleStatsArguments implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ArticleStatsArguments> CREATOR = new Creator();
    private final String articleId;
    private final boolean isFromSearchBrowse;

    public /* synthetic */ ArticleStatsArguments(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ ArticleStatsArguments copy$default(ArticleStatsArguments articleStatsArguments, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = articleStatsArguments.articleId;
        }
        if ((i & 2) != 0) {
            z = articleStatsArguments.isFromSearchBrowse;
        }
        return articleStatsArguments.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getArticleId() {
        return this.articleId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFromSearchBrowse() {
        return this.isFromSearchBrowse;
    }

    public final ArticleStatsArguments copy(String articleId, boolean isFromSearchBrowse) {
        articleId.getClass();
        return new ArticleStatsArguments(articleId, isFromSearchBrowse);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleStatsArguments)) {
            return false;
        }
        ArticleStatsArguments articleStatsArguments = (ArticleStatsArguments) other;
        if (Intrinsics.areEqual(this.articleId, articleStatsArguments.articleId) && this.isFromSearchBrowse == articleStatsArguments.isFromSearchBrowse) {
            return true;
        }
        return false;
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFromSearchBrowse) + (this.articleId.hashCode() * 31);
    }

    public final boolean isFromSearchBrowse() {
        return this.isFromSearchBrowse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArticleStatsArguments(articleId=");
        sb.append(this.articleId);
        sb.append(", isFromSearchBrowse=");
        return hdi.t(sb, this.isFromSearchBrowse, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.articleId);
        dest.writeInt(this.isFromSearchBrowse ? 1 : 0);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ArticleStatsArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticleStatsArguments createFromParcel(Parcel parcel) {
            boolean z;
            parcel.getClass();
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ArticleStatsArguments(readString, z);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ArticleStatsArguments[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticleStatsArguments[] newArray(int i) {
            return new ArticleStatsArguments[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ArticleStatsArguments createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleStatsArguments(String str) {
        this(str, false, 2, null);
        str.getClass();
    }

    public ArticleStatsArguments(String str, boolean z) {
        str.getClass();
        this.articleId = str;
        this.isFromSearchBrowse = z;
    }

    public ArticleStatsArguments() {
        this(null, false, 3, null);
    }
}
