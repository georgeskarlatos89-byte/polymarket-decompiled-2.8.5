package defpackage;

import io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberEntity;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import java.util.Collection;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ggn {
    public static final Object a(Collection collection, q55 q55Var) {
        if (collection.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        return new x11((hi6[]) collection.toArray(new hi6[0])).a(q55Var);
    }

    public static final MemberEntity b(Member member) {
        boolean z;
        member.getClass();
        String userId = member.getUserId();
        Date createdAt = member.getCreatedAt();
        Date updatedAt = member.getUpdatedAt();
        Boolean isInvited = member.isInvited();
        if (isInvited != null) {
            z = isInvited.booleanValue();
        } else {
            z = false;
        }
        return new MemberEntity(userId, null, createdAt, updatedAt, z, member.getInviteAcceptedAt(), member.getInviteRejectedAt(), member.getShadowBanned(), member.getBanned(), member.getChannelRole(), member.getNotificationsMuted(), member.getStatus(), member.getBanExpires(), member.getPinnedAt(), member.getArchivedAt(), member.getExtraData(), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(MemberEntity memberEntity, Function2 function2, q55 q55Var) {
        g9c g9cVar;
        int i;
        MemberEntity memberEntity2 = memberEntity;
        if (q55Var instanceof g9c) {
            g9c g9cVar2 = (g9c) q55Var;
            int i2 = g9cVar2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g9cVar2.m = i2 - Integer.MIN_VALUE;
                g9cVar = g9cVar2;
                Object obj = g9cVar.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = g9cVar.m;
                if (i == 0) {
                    if (i == 1) {
                        memberEntity2 = g9cVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    String str = memberEntity2.a;
                    g9cVar.k = memberEntity2;
                    g9cVar.m = 1;
                    obj = function2.invoke(str, g9cVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                return new Member((User) obj, memberEntity2.c, memberEntity2.d, Boolean.valueOf(memberEntity2.e), memberEntity2.f, memberEntity2.g, memberEntity2.h, memberEntity2.i, memberEntity2.j, memberEntity2.k, memberEntity2.l, memberEntity2.m, memberEntity2.n, memberEntity2.o, memberEntity2.p);
            }
        }
        g9cVar = new q55(q55Var);
        Object obj2 = g9cVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = g9cVar.m;
        if (i == 0) {
        }
        return new Member((User) obj2, memberEntity2.c, memberEntity2.d, Boolean.valueOf(memberEntity2.e), memberEntity2.f, memberEntity2.g, memberEntity2.h, memberEntity2.i, memberEntity2.j, memberEntity2.k, memberEntity2.l, memberEntity2.m, memberEntity2.n, memberEntity2.o, memberEntity2.p);
    }

    public static String d(d7m d7mVar) {
        StringBuilder sb = new StringBuilder(d7mVar.d());
        for (int i = 0; i < d7mVar.d(); i++) {
            byte a = d7mVar.a(i);
            if (a != 34) {
                if (a != 39) {
                    if (a != 92) {
                        switch (a) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (a >= 32 && a <= 126) {
                                    sb.append((char) a);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a >>> 6) & 3) + 48));
                                    sb.append((char) (((a >>> 3) & 7) + 48));
                                    sb.append((char) ((a & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
