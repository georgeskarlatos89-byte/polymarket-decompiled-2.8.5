package com.polymarket.data;

import com.polymarket.data.ESquadMember;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001b2\u00020\u0001:\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "displayText", "", "getDisplayText", "()Ljava/lang/String;", "Swift_displayText", "className", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "SquadCreatedCase", "MemberJoinedCase", "MemberLeftCase", "MemberRemovedCase", "MemberRoleChangedCase", "NicknameSetCase", "NicknameClearedCase", "SquadRenamedCase", "SquadImageUpdatedCase", "MemberInvitedCase", "ContactInvitedCase", "Companion", "Lcom/polymarket/data/ESquadStatusUpdate$ContactInvitedCase;", "Lcom/polymarket/data/ESquadStatusUpdate$MemberInvitedCase;", "Lcom/polymarket/data/ESquadStatusUpdate$MemberJoinedCase;", "Lcom/polymarket/data/ESquadStatusUpdate$MemberLeftCase;", "Lcom/polymarket/data/ESquadStatusUpdate$MemberRemovedCase;", "Lcom/polymarket/data/ESquadStatusUpdate$MemberRoleChangedCase;", "Lcom/polymarket/data/ESquadStatusUpdate$NicknameClearedCase;", "Lcom/polymarket/data/ESquadStatusUpdate$NicknameSetCase;", "Lcom/polymarket/data/ESquadStatusUpdate$SquadCreatedCase;", "Lcom/polymarket/data/ESquadStatusUpdate$SquadImageUpdatedCase;", "Lcom/polymarket/data/ESquadStatusUpdate$SquadRenamedCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ESquadStatusUpdate implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$ContactInvitedCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "inviter", "getInviter", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ContactInvitedCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef inviter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactInvitedCase(ESquadStatusMemberRef eSquadStatusMemberRef) {
            super(null);
            eSquadStatusMemberRef.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.inviter = eSquadStatusMemberRef;
        }

        public boolean equals(Object other) {
            if (!(other instanceof ContactInvitedCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((ContactInvitedCase) other).associated0);
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getInviter() {
            return this.inviter;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$MemberInvitedCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "associated1", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;Lcom/polymarket/data/ESquadStatusMemberRef;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "getAssociated1", "invitee", "getInvitee", "inviter", "getInviter", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MemberInvitedCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef associated1;
        private final ESquadStatusMemberRef invitee;
        private final ESquadStatusMemberRef inviter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemberInvitedCase(ESquadStatusMemberRef eSquadStatusMemberRef, ESquadStatusMemberRef eSquadStatusMemberRef2) {
            super(null);
            eSquadStatusMemberRef.getClass();
            eSquadStatusMemberRef2.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.associated1 = eSquadStatusMemberRef2;
            this.invitee = eSquadStatusMemberRef;
            this.inviter = eSquadStatusMemberRef2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof MemberInvitedCase)) {
                return false;
            }
            MemberInvitedCase memberInvitedCase = (MemberInvitedCase) other;
            if (!Intrinsics.areEqual(this.associated0, memberInvitedCase.associated0) || !Intrinsics.areEqual(this.associated1, memberInvitedCase.associated1)) {
                return false;
            }
            return true;
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getAssociated1() {
            return this.associated1;
        }

        public final ESquadStatusMemberRef getInvitee() {
            return this.invitee;
        }

        public final ESquadStatusMemberRef getInviter() {
            return this.inviter;
        }

        public int hashCode() {
            Hasher.Companion companion = Hasher.INSTANCE;
            return companion.combine(companion.combine(1, this.associated0), this.associated1);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$MemberJoinedCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "associated1", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;Lcom/polymarket/data/ESquadStatusMemberRef;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "getAssociated1", "member", "getMember", "inviter", "getInviter", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MemberJoinedCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef associated1;
        private final ESquadStatusMemberRef inviter;
        private final ESquadStatusMemberRef member;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemberJoinedCase(ESquadStatusMemberRef eSquadStatusMemberRef, ESquadStatusMemberRef eSquadStatusMemberRef2) {
            super(null);
            eSquadStatusMemberRef.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.associated1 = eSquadStatusMemberRef2;
            this.member = eSquadStatusMemberRef;
            this.inviter = eSquadStatusMemberRef2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof MemberJoinedCase)) {
                return false;
            }
            MemberJoinedCase memberJoinedCase = (MemberJoinedCase) other;
            if (!Intrinsics.areEqual(this.associated0, memberJoinedCase.associated0) || !Intrinsics.areEqual(this.associated1, memberJoinedCase.associated1)) {
                return false;
            }
            return true;
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getAssociated1() {
            return this.associated1;
        }

        public final ESquadStatusMemberRef getInviter() {
            return this.inviter;
        }

        public final ESquadStatusMemberRef getMember() {
            return this.member;
        }

        public int hashCode() {
            Hasher.Companion companion = Hasher.INSTANCE;
            return companion.combine(companion.combine(1, this.associated0), this.associated1);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$MemberLeftCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "member", "getMember", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MemberLeftCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef member;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemberLeftCase(ESquadStatusMemberRef eSquadStatusMemberRef) {
            super(null);
            eSquadStatusMemberRef.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.member = eSquadStatusMemberRef;
        }

        public boolean equals(Object other) {
            if (!(other instanceof MemberLeftCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((MemberLeftCase) other).associated0);
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getMember() {
            return this.member;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$MemberRemovedCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "associated1", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;Lcom/polymarket/data/ESquadStatusMemberRef;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "getAssociated1", "member", "getMember", "removedBy", "getRemovedBy", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MemberRemovedCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef associated1;
        private final ESquadStatusMemberRef member;
        private final ESquadStatusMemberRef removedBy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemberRemovedCase(ESquadStatusMemberRef eSquadStatusMemberRef, ESquadStatusMemberRef eSquadStatusMemberRef2) {
            super(null);
            eSquadStatusMemberRef.getClass();
            eSquadStatusMemberRef2.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.associated1 = eSquadStatusMemberRef2;
            this.member = eSquadStatusMemberRef;
            this.removedBy = eSquadStatusMemberRef2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof MemberRemovedCase)) {
                return false;
            }
            MemberRemovedCase memberRemovedCase = (MemberRemovedCase) other;
            if (!Intrinsics.areEqual(this.associated0, memberRemovedCase.associated0) || !Intrinsics.areEqual(this.associated1, memberRemovedCase.associated1)) {
                return false;
            }
            return true;
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getAssociated1() {
            return this.associated1;
        }

        public final ESquadStatusMemberRef getMember() {
            return this.member;
        }

        public final ESquadStatusMemberRef getRemovedBy() {
            return this.removedBy;
        }

        public int hashCode() {
            Hasher.Companion companion = Hasher.INSTANCE;
            return companion.combine(companion.combine(1, this.associated0), this.associated1);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$MemberRoleChangedCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "associated1", "associated2", "Lcom/polymarket/data/ESquadMember$Role;", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;Lcom/polymarket/data/ESquadStatusMemberRef;Lcom/polymarket/data/ESquadMember$Role;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "getAssociated1", "getAssociated2", "()Lcom/polymarket/data/ESquadMember$Role;", "member", "getMember", "changedBy", "getChangedBy", "newRole", "getNewRole", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MemberRoleChangedCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef associated1;
        private final ESquadMember.Role associated2;
        private final ESquadStatusMemberRef changedBy;
        private final ESquadStatusMemberRef member;
        private final ESquadMember.Role newRole;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemberRoleChangedCase(ESquadStatusMemberRef eSquadStatusMemberRef, ESquadStatusMemberRef eSquadStatusMemberRef2, ESquadMember.Role role) {
            super(null);
            eSquadStatusMemberRef.getClass();
            eSquadStatusMemberRef2.getClass();
            role.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.associated1 = eSquadStatusMemberRef2;
            this.associated2 = role;
            this.member = eSquadStatusMemberRef;
            this.changedBy = eSquadStatusMemberRef2;
            this.newRole = role;
        }

        public boolean equals(Object other) {
            if (!(other instanceof MemberRoleChangedCase)) {
                return false;
            }
            MemberRoleChangedCase memberRoleChangedCase = (MemberRoleChangedCase) other;
            if (!Intrinsics.areEqual(this.associated0, memberRoleChangedCase.associated0) || !Intrinsics.areEqual(this.associated1, memberRoleChangedCase.associated1) || this.associated2 != memberRoleChangedCase.associated2) {
                return false;
            }
            return true;
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getAssociated1() {
            return this.associated1;
        }

        public final ESquadMember.Role getAssociated2() {
            return this.associated2;
        }

        public final ESquadStatusMemberRef getChangedBy() {
            return this.changedBy;
        }

        public final ESquadStatusMemberRef getMember() {
            return this.member;
        }

        public final ESquadMember.Role getNewRole() {
            return this.newRole;
        }

        public int hashCode() {
            Hasher.Companion companion = Hasher.INSTANCE;
            return companion.combine(companion.combine(companion.combine(1, this.associated0), this.associated1), this.associated2);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$NicknameClearedCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "associated1", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;Lcom/polymarket/data/ESquadStatusMemberRef;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "getAssociated1", "member", "getMember", "clearedBy", "getClearedBy", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class NicknameClearedCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef associated1;
        private final ESquadStatusMemberRef clearedBy;
        private final ESquadStatusMemberRef member;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NicknameClearedCase(ESquadStatusMemberRef eSquadStatusMemberRef, ESquadStatusMemberRef eSquadStatusMemberRef2) {
            super(null);
            eSquadStatusMemberRef.getClass();
            eSquadStatusMemberRef2.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.associated1 = eSquadStatusMemberRef2;
            this.member = eSquadStatusMemberRef;
            this.clearedBy = eSquadStatusMemberRef2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof NicknameClearedCase)) {
                return false;
            }
            NicknameClearedCase nicknameClearedCase = (NicknameClearedCase) other;
            if (!Intrinsics.areEqual(this.associated0, nicknameClearedCase.associated0) || !Intrinsics.areEqual(this.associated1, nicknameClearedCase.associated1)) {
                return false;
            }
            return true;
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getAssociated1() {
            return this.associated1;
        }

        public final ESquadStatusMemberRef getClearedBy() {
            return this.clearedBy;
        }

        public final ESquadStatusMemberRef getMember() {
            return this.member;
        }

        public int hashCode() {
            Hasher.Companion companion = Hasher.INSTANCE;
            return companion.combine(companion.combine(1, this.associated0), this.associated1);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$NicknameSetCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "associated1", "associated2", "", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;Lcom/polymarket/data/ESquadStatusMemberRef;Ljava/lang/String;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "getAssociated1", "getAssociated2", "()Ljava/lang/String;", "member", "getMember", "setBy", "getSetBy", "newNickname", "getNewNickname", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class NicknameSetCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef associated1;
        private final String associated2;
        private final ESquadStatusMemberRef member;
        private final String newNickname;
        private final ESquadStatusMemberRef setBy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NicknameSetCase(ESquadStatusMemberRef eSquadStatusMemberRef, ESquadStatusMemberRef eSquadStatusMemberRef2, String str) {
            super(null);
            eSquadStatusMemberRef.getClass();
            eSquadStatusMemberRef2.getClass();
            str.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.associated1 = eSquadStatusMemberRef2;
            this.associated2 = str;
            this.member = eSquadStatusMemberRef;
            this.setBy = eSquadStatusMemberRef2;
            this.newNickname = str;
        }

        public boolean equals(Object other) {
            if (!(other instanceof NicknameSetCase)) {
                return false;
            }
            NicknameSetCase nicknameSetCase = (NicknameSetCase) other;
            if (!Intrinsics.areEqual(this.associated0, nicknameSetCase.associated0) || !Intrinsics.areEqual(this.associated1, nicknameSetCase.associated1) || !Intrinsics.areEqual(this.associated2, nicknameSetCase.associated2)) {
                return false;
            }
            return true;
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final ESquadStatusMemberRef getMember() {
            return this.member;
        }

        public final String getNewNickname() {
            return this.newNickname;
        }

        public final ESquadStatusMemberRef getSetBy() {
            return this.setBy;
        }

        public int hashCode() {
            Hasher.Companion companion = Hasher.INSTANCE;
            return companion.combine(companion.combine(companion.combine(1, this.associated0), this.associated1), this.associated2);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$SquadCreatedCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "creator", "getCreator", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadCreatedCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef creator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SquadCreatedCase(ESquadStatusMemberRef eSquadStatusMemberRef) {
            super(null);
            eSquadStatusMemberRef.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.creator = eSquadStatusMemberRef;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SquadCreatedCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((SquadCreatedCase) other).associated0);
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getCreator() {
            return this.creator;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$SquadImageUpdatedCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "updatedBy", "getUpdatedBy", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadImageUpdatedCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final ESquadStatusMemberRef updatedBy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SquadImageUpdatedCase(ESquadStatusMemberRef eSquadStatusMemberRef) {
            super(null);
            eSquadStatusMemberRef.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.updatedBy = eSquadStatusMemberRef;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SquadImageUpdatedCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((SquadImageUpdatedCase) other).associated0);
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final ESquadStatusMemberRef getUpdatedBy() {
            return this.updatedBy;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$SquadRenamedCase;", "Lcom/polymarket/data/ESquadStatusUpdate;", "associated0", "Lcom/polymarket/data/ESquadStatusMemberRef;", "associated1", "", "<init>", "(Lcom/polymarket/data/ESquadStatusMemberRef;Ljava/lang/String;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusMemberRef;", "getAssociated1", "()Ljava/lang/String;", "renamedBy", "getRenamedBy", "newName", "getNewName", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadRenamedCase extends ESquadStatusUpdate {
        private final ESquadStatusMemberRef associated0;
        private final String associated1;
        private final String newName;
        private final ESquadStatusMemberRef renamedBy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SquadRenamedCase(ESquadStatusMemberRef eSquadStatusMemberRef, String str) {
            super(null);
            eSquadStatusMemberRef.getClass();
            str.getClass();
            this.associated0 = eSquadStatusMemberRef;
            this.associated1 = str;
            this.renamedBy = eSquadStatusMemberRef;
            this.newName = str;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SquadRenamedCase)) {
                return false;
            }
            SquadRenamedCase squadRenamedCase = (SquadRenamedCase) other;
            if (!Intrinsics.areEqual(this.associated0, squadRenamedCase.associated0) || !Intrinsics.areEqual(this.associated1, squadRenamedCase.associated1)) {
                return false;
            }
            return true;
        }

        public final ESquadStatusMemberRef getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getNewName() {
            return this.newName;
        }

        public final ESquadStatusMemberRef getRenamedBy() {
            return this.renamedBy;
        }

        public int hashCode() {
            Hasher.Companion companion = Hasher.INSTANCE;
            return companion.combine(companion.combine(1, this.associated0), this.associated1);
        }
    }

    public /* synthetic */ ESquadStatusUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native String Swift_displayText(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getDisplayText() {
        return Swift_displayText(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0007J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u0015J\u0013\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u0015H\u0082 ¨\u0006#"}, d2 = {"Lcom/polymarket/data/ESquadStatusUpdate$Companion;", "", "<init>", "()V", "squadCreated", "Lcom/polymarket/data/ESquadStatusUpdate;", "creator", "Lcom/polymarket/data/ESquadStatusMemberRef;", "memberJoined", "member", "inviter", "memberLeft", "memberRemoved", "removedBy", "memberRoleChanged", "changedBy", "newRole", "Lcom/polymarket/data/ESquadMember$Role;", "nicknameSet", "setBy", "newNickname", "", "nicknameCleared", "clearedBy", "squadRenamed", "renamedBy", "newName", "squadImageUpdated", "updatedBy", "memberInvited", "invitee", "contactInvited", "decode", "protoJSONString", "Swift_Companion_decode_0", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ESquadStatusUpdate Swift_Companion_decode_0(String protoJSONString);

        public final ESquadStatusUpdate contactInvited(ESquadStatusMemberRef inviter) {
            inviter.getClass();
            return new ContactInvitedCase(inviter);
        }

        public final ESquadStatusUpdate decode(String protoJSONString) {
            protoJSONString.getClass();
            return Swift_Companion_decode_0(protoJSONString);
        }

        public final ESquadStatusUpdate memberInvited(ESquadStatusMemberRef invitee, ESquadStatusMemberRef inviter) {
            invitee.getClass();
            inviter.getClass();
            return new MemberInvitedCase(invitee, inviter);
        }

        public final ESquadStatusUpdate memberJoined(ESquadStatusMemberRef member, ESquadStatusMemberRef inviter) {
            member.getClass();
            return new MemberJoinedCase(member, inviter);
        }

        public final ESquadStatusUpdate memberLeft(ESquadStatusMemberRef member) {
            member.getClass();
            return new MemberLeftCase(member);
        }

        public final ESquadStatusUpdate memberRemoved(ESquadStatusMemberRef member, ESquadStatusMemberRef removedBy) {
            member.getClass();
            removedBy.getClass();
            return new MemberRemovedCase(member, removedBy);
        }

        public final ESquadStatusUpdate memberRoleChanged(ESquadStatusMemberRef member, ESquadStatusMemberRef changedBy, ESquadMember.Role newRole) {
            member.getClass();
            changedBy.getClass();
            newRole.getClass();
            return new MemberRoleChangedCase(member, changedBy, newRole);
        }

        public final ESquadStatusUpdate nicknameCleared(ESquadStatusMemberRef member, ESquadStatusMemberRef clearedBy) {
            member.getClass();
            clearedBy.getClass();
            return new NicknameClearedCase(member, clearedBy);
        }

        public final ESquadStatusUpdate nicknameSet(ESquadStatusMemberRef member, ESquadStatusMemberRef setBy, String newNickname) {
            member.getClass();
            setBy.getClass();
            newNickname.getClass();
            return new NicknameSetCase(member, setBy, newNickname);
        }

        public final ESquadStatusUpdate squadCreated(ESquadStatusMemberRef creator) {
            creator.getClass();
            return new SquadCreatedCase(creator);
        }

        public final ESquadStatusUpdate squadImageUpdated(ESquadStatusMemberRef updatedBy) {
            updatedBy.getClass();
            return new SquadImageUpdatedCase(updatedBy);
        }

        public final ESquadStatusUpdate squadRenamed(ESquadStatusMemberRef renamedBy, String newName) {
            renamedBy.getClass();
            newName.getClass();
            return new SquadRenamedCase(renamedBy, newName);
        }

        private Companion() {
        }
    }

    private ESquadStatusUpdate() {
    }
}
