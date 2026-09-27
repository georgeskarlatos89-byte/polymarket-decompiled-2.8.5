package io.intercom.android.sdk.m5.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.hdi;
import defpackage.m51;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "Landroid/os/Parcelable;", "<init>", "()V", PlaceTypes.ROUTE, "", "getRoute", "()Ljava/lang/String;", "HomeScreenArgs", "MessagesScreenArgs", "TicketsScreenArgs", "TicketDetailsScreenArgs", "ConversationScreenArgs", "HelpCenterCollectionsArgs", "HelpCenterCollectionArgs", "NoContent", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$ConversationScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionsArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HomeScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$MessagesScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$NoContent;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$TicketDetailsScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$TicketsScreenArgs;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class IntercomRootActivityArgs implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ IntercomRootActivityArgs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getRoute();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"H×\u0003J\t\u0010#\u001a\u00020\u001fH×\u0001J\t\u0010$\u001a\u00020\u0003H×\u0001J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fH\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$ConversationScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "conversationId", "", "initialMessage", "isLaunchedProgrammatically", "", "articleId", "articleTitle", "transitionArgs", "Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;)V", "getConversationId", "()Ljava/lang/String;", "()Z", "getArticleId", "getArticleTitle", "getTransitionArgs", "()Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "getEncodedInitialMessage", PlaceTypes.ROUTE, "getRoute", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ConversationScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ConversationScreenArgs> CREATOR = new Creator();
        private final String articleId;
        private final String articleTitle;
        private final String conversationId;
        private final String initialMessage;
        private final boolean isLaunchedProgrammatically;
        private final TransitionArgs transitionArgs;

        public /* synthetic */ ConversationScreenArgs(String str, String str2, boolean z, String str3, String str4, TransitionArgs transitionArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? new TransitionArgs(null, null, null, null, 15, null) : transitionArgs);
        }

        /* renamed from: component2, reason: from getter */
        private final String getInitialMessage() {
            return this.initialMessage;
        }

        public static /* synthetic */ ConversationScreenArgs copy$default(ConversationScreenArgs conversationScreenArgs, String str, String str2, boolean z, String str3, String str4, TransitionArgs transitionArgs, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversationScreenArgs.conversationId;
            }
            if ((i & 2) != 0) {
                str2 = conversationScreenArgs.initialMessage;
            }
            if ((i & 4) != 0) {
                z = conversationScreenArgs.isLaunchedProgrammatically;
            }
            if ((i & 8) != 0) {
                str3 = conversationScreenArgs.articleId;
            }
            if ((i & 16) != 0) {
                str4 = conversationScreenArgs.articleTitle;
            }
            if ((i & 32) != 0) {
                transitionArgs = conversationScreenArgs.transitionArgs;
            }
            String str5 = str4;
            TransitionArgs transitionArgs2 = transitionArgs;
            return conversationScreenArgs.copy(str, str2, z, str3, str5, transitionArgs2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsLaunchedProgrammatically() {
            return this.isLaunchedProgrammatically;
        }

        /* renamed from: component4, reason: from getter */
        public final String getArticleId() {
            return this.articleId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getArticleTitle() {
            return this.articleTitle;
        }

        /* renamed from: component6, reason: from getter */
        public final TransitionArgs getTransitionArgs() {
            return this.transitionArgs;
        }

        public final ConversationScreenArgs copy(String conversationId, String initialMessage, boolean isLaunchedProgrammatically, String articleId, String articleTitle, TransitionArgs transitionArgs) {
            initialMessage.getClass();
            transitionArgs.getClass();
            return new ConversationScreenArgs(conversationId, initialMessage, isLaunchedProgrammatically, articleId, articleTitle, transitionArgs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationScreenArgs)) {
                return false;
            }
            ConversationScreenArgs conversationScreenArgs = (ConversationScreenArgs) other;
            if (Intrinsics.areEqual(this.conversationId, conversationScreenArgs.conversationId) && Intrinsics.areEqual(this.initialMessage, conversationScreenArgs.initialMessage) && this.isLaunchedProgrammatically == conversationScreenArgs.isLaunchedProgrammatically && Intrinsics.areEqual(this.articleId, conversationScreenArgs.articleId) && Intrinsics.areEqual(this.articleTitle, conversationScreenArgs.articleTitle) && Intrinsics.areEqual(this.transitionArgs, conversationScreenArgs.transitionArgs)) {
                return true;
            }
            return false;
        }

        public final String getArticleId() {
            return this.articleId;
        }

        public final String getArticleTitle() {
            return this.articleTitle;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getEncodedInitialMessage() {
            String encode = Uri.encode(this.initialMessage);
            encode.getClass();
            return encode;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "CONVERSATION?conversationId=" + this.conversationId + "&initialMessage=" + getEncodedInitialMessage() + "&articleId=" + this.articleId + "&articleTitle=" + this.articleTitle + "&isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + "&transitionArgs=" + this.transitionArgs;
        }

        public final TransitionArgs getTransitionArgs() {
            return this.transitionArgs;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.conversationId;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int g = hdi.g(hdi.e(hashCode * 31, 31, this.initialMessage), 31, this.isLaunchedProgrammatically);
            String str2 = this.articleId;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i2 = (g + hashCode2) * 31;
            String str3 = this.articleTitle;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return this.transitionArgs.hashCode() + ((i2 + i) * 31);
        }

        public final boolean isLaunchedProgrammatically() {
            return this.isLaunchedProgrammatically;
        }

        public String toString() {
            return "ConversationScreenArgs(conversationId=" + this.conversationId + ", initialMessage=" + this.initialMessage + ", isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + ", articleId=" + this.articleId + ", articleTitle=" + this.articleTitle + ", transitionArgs=" + this.transitionArgs + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.conversationId);
            dest.writeString(this.initialMessage);
            dest.writeInt(this.isLaunchedProgrammatically ? 1 : 0);
            dest.writeString(this.articleId);
            dest.writeString(this.articleTitle);
            this.transitionArgs.writeToParcel(dest, flags);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ConversationScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConversationScreenArgs createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new ConversationScreenArgs(readString, readString2, z, parcel.readString(), parcel.readString(), TransitionArgs.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ConversationScreenArgs[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConversationScreenArgs[] newArray(int i) {
                return new ConversationScreenArgs[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ConversationScreenArgs createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public ConversationScreenArgs() {
            this(null, null, false, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationScreenArgs(String str, String str2, boolean z, String str3, String str4, TransitionArgs transitionArgs) {
            super(null);
            str2.getClass();
            transitionArgs.getClass();
            this.conversationId = str;
            this.initialMessage = str2;
            this.isLaunchedProgrammatically = z;
            this.articleId = str3;
            this.articleTitle = str4;
            this.transitionArgs = transitionArgs;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "collectionId", "", "metricPlace", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCollectionId", "()Ljava/lang/String;", "getMetricPlace", PlaceTypes.ROUTE, "getRoute", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class HelpCenterCollectionArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<HelpCenterCollectionArgs> CREATOR = new Creator();
        private final String collectionId;
        private final String metricPlace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionArgs(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.collectionId = str;
            this.metricPlace = str2;
        }

        public static /* synthetic */ HelpCenterCollectionArgs copy$default(HelpCenterCollectionArgs helpCenterCollectionArgs, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = helpCenterCollectionArgs.collectionId;
            }
            if ((i & 2) != 0) {
                str2 = helpCenterCollectionArgs.metricPlace;
            }
            return helpCenterCollectionArgs.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCollectionId() {
            return this.collectionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final HelpCenterCollectionArgs copy(String collectionId, String metricPlace) {
            collectionId.getClass();
            metricPlace.getClass();
            return new HelpCenterCollectionArgs(collectionId, metricPlace);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HelpCenterCollectionArgs)) {
                return false;
            }
            HelpCenterCollectionArgs helpCenterCollectionArgs = (HelpCenterCollectionArgs) other;
            if (Intrinsics.areEqual(this.collectionId, helpCenterCollectionArgs.collectionId) && Intrinsics.areEqual(this.metricPlace, helpCenterCollectionArgs.metricPlace)) {
                return true;
            }
            return false;
        }

        public final String getCollectionId() {
            return this.collectionId;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return this.metricPlace.hashCode() + (this.collectionId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HelpCenterCollectionArgs(collectionId=");
            sb.append(this.collectionId);
            sb.append(", metricPlace=");
            return m51.m(sb, this.metricPlace, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.collectionId);
            dest.writeString(this.metricPlace);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HelpCenterCollectionArgs(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ HelpCenterCollectionArgs[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionArgs[] newArray(int i) {
                return new HelpCenterCollectionArgs[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ HelpCenterCollectionArgs createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0012H×\u0001J\t\u0010\u0018\u001a\u00020\u0004H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HelpCenterCollectionsArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "collectionIds", "", "", "metricPlace", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getCollectionIds", "()Ljava/util/List;", "getMetricPlace", "()Ljava/lang/String;", PlaceTypes.ROUTE, "getRoute", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class HelpCenterCollectionsArgs extends IntercomRootActivityArgs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<HelpCenterCollectionsArgs> CREATOR = new Creator();
        private final List<String> collectionIds;
        private final String metricPlace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionsArgs(List<String> list, String str) {
            super(null);
            list.getClass();
            str.getClass();
            this.collectionIds = list;
            this.metricPlace = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HelpCenterCollectionsArgs copy$default(HelpCenterCollectionsArgs helpCenterCollectionsArgs, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = helpCenterCollectionsArgs.collectionIds;
            }
            if ((i & 2) != 0) {
                str = helpCenterCollectionsArgs.metricPlace;
            }
            return helpCenterCollectionsArgs.copy(list, str);
        }

        public final List<String> component1() {
            return this.collectionIds;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final HelpCenterCollectionsArgs copy(List<String> collectionIds, String metricPlace) {
            collectionIds.getClass();
            metricPlace.getClass();
            return new HelpCenterCollectionsArgs(collectionIds, metricPlace);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HelpCenterCollectionsArgs)) {
                return false;
            }
            HelpCenterCollectionsArgs helpCenterCollectionsArgs = (HelpCenterCollectionsArgs) other;
            if (Intrinsics.areEqual(this.collectionIds, helpCenterCollectionsArgs.collectionIds) && Intrinsics.areEqual(this.metricPlace, helpCenterCollectionsArgs.metricPlace)) {
                return true;
            }
            return false;
        }

        public final List<String> getCollectionIds() {
            return this.collectionIds;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return this.metricPlace.hashCode() + (this.collectionIds.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HelpCenterCollectionsArgs(collectionIds=");
            sb.append(this.collectionIds);
            sb.append(", metricPlace=");
            return m51.m(sb, this.metricPlace, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeStringList(this.collectionIds);
            dest.writeString(this.metricPlace);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionsArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionsArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HelpCenterCollectionsArgs(parcel.createStringArrayList(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ HelpCenterCollectionsArgs[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionsArgs[] newArray(int i) {
                return new HelpCenterCollectionsArgs[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ HelpCenterCollectionsArgs createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public /* synthetic */ HelpCenterCollectionsArgs(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, str);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$HomeScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "<init>", "()V", PlaceTypes.ROUTE, "", "getRoute", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class HomeScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final HomeScreenArgs INSTANCE = new HomeScreenArgs();
        public static final Parcelable.Creator<HomeScreenArgs> CREATOR = new Creator();

        private HomeScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "HOME";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<HomeScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HomeScreenArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return HomeScreenArgs.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ HomeScreenArgs[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HomeScreenArgs[] newArray(int i) {
                return new HomeScreenArgs[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ HomeScreenArgs createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$MessagesScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "<init>", "()V", PlaceTypes.ROUTE, "", "getRoute", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class MessagesScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final MessagesScreenArgs INSTANCE = new MessagesScreenArgs();
        public static final Parcelable.Creator<MessagesScreenArgs> CREATOR = new Creator();

        private MessagesScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "MESSAGES";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<MessagesScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessagesScreenArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return MessagesScreenArgs.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MessagesScreenArgs[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessagesScreenArgs[] newArray(int i) {
                return new MessagesScreenArgs[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MessagesScreenArgs createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$NoContent;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "<init>", "()V", PlaceTypes.ROUTE, "", "getRoute", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NoContent extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final NoContent INSTANCE = new NoContent();
        public static final Parcelable.Creator<NoContent> CREATOR = new Creator();

        private NoContent() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<NoContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoContent createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return NoContent.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ NoContent[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoContent[] newArray(int i) {
                return new NoContent[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ NoContent createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$TicketDetailsScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "ticketId", "", TicketDetailDestinationKt.LAUNCHED_FROM, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTicketId", "()Ljava/lang/String;", "getFrom", PlaceTypes.ROUTE, "getRoute", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class TicketDetailsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TicketDetailsScreenArgs> CREATOR = new Creator();
        private final String from;
        private final String ticketId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketDetailsScreenArgs(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.ticketId = str;
            this.from = str2;
        }

        public static /* synthetic */ TicketDetailsScreenArgs copy$default(TicketDetailsScreenArgs ticketDetailsScreenArgs, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticketDetailsScreenArgs.ticketId;
            }
            if ((i & 2) != 0) {
                str2 = ticketDetailsScreenArgs.from;
            }
            return ticketDetailsScreenArgs.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTicketId() {
            return this.ticketId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        public final TicketDetailsScreenArgs copy(String ticketId, String from) {
            ticketId.getClass();
            from.getClass();
            return new TicketDetailsScreenArgs(ticketId, from);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TicketDetailsScreenArgs)) {
                return false;
            }
            TicketDetailsScreenArgs ticketDetailsScreenArgs = (TicketDetailsScreenArgs) other;
            if (Intrinsics.areEqual(this.ticketId, ticketDetailsScreenArgs.ticketId) && Intrinsics.areEqual(this.from, ticketDetailsScreenArgs.from)) {
                return true;
            }
            return false;
        }

        public final String getFrom() {
            return this.from;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "TICKET_DETAIL/" + this.ticketId + "?from=" + this.from;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return this.from.hashCode() + (this.ticketId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TicketDetailsScreenArgs(ticketId=");
            sb.append(this.ticketId);
            sb.append(", from=");
            return m51.m(sb, this.from, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.ticketId);
            dest.writeString(this.from);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<TicketDetailsScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketDetailsScreenArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TicketDetailsScreenArgs(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ TicketDetailsScreenArgs[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketDetailsScreenArgs[] newArray(int i) {
                return new TicketDetailsScreenArgs[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ TicketDetailsScreenArgs createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs$TicketsScreenArgs;", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "<init>", "()V", PlaceTypes.ROUTE, "", "getRoute", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TicketsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final TicketsScreenArgs INSTANCE = new TicketsScreenArgs();
        public static final Parcelable.Creator<TicketsScreenArgs> CREATOR = new Creator();

        private TicketsScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "TICKETS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<TicketsScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketsScreenArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return TicketsScreenArgs.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ TicketsScreenArgs[] newArray(int i) {
                return newArray(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketsScreenArgs[] newArray(int i) {
                return new TicketsScreenArgs[i];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ TicketsScreenArgs createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }
    }

    private IntercomRootActivityArgs() {
    }
}
