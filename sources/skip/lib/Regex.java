package skip.lib;

import defpackage.ewf;
import defpackage.r22;
import defpackage.u0a;
import defpackage.ws8;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0002\u001a\u00020\u0003J\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003J,\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lskip/lib/Regex;", "Lskip/lib/RegexComponent;", "string", "", "<init>", "(Ljava/lang/String;)V", "_regex", "Lkotlin/text/Regex;", "regex", "getRegex", "()Lskip/lib/Regex;", "matches", "Lskip/lib/Array;", "Lskip/lib/Regex$Match;", "replace", "with", "maxReplacements", "", "Lkotlin/Function1;", "Match", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Regex implements RegexComponent {
    private final kotlin.text.Regex _regex;

    public Regex(String str) {
        str.getClass();
        this._regex = new kotlin.text.Regex(str, ewf.MULTILINE);
    }

    public static /* synthetic */ CharSequence a(Ref.b bVar, int i, Function1 function1, MatchResult matchResult) {
        return replace$lambda$0(bVar, i, function1, matchResult);
    }

    public static /* synthetic */ String replace$default(Regex regex, String str, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = NumbersKt.getMax(u0a.a);
        }
        return regex.replace(str, i, function1);
    }

    private static final CharSequence replace$lambda$0(Ref.b bVar, int i, Function1 function1, MatchResult matchResult) {
        String value;
        matchResult.getClass();
        int i2 = bVar.a;
        if (i2 < i) {
            bVar.a = i2 + 1;
            value = (String) function1.invoke(new Match(matchResult));
        } else {
            value = matchResult.getValue();
        }
        String quoteReplacement = Matcher.quoteReplacement(value);
        quoteReplacement.getClass();
        return quoteReplacement;
    }

    public final Array<Match> matches(String string) {
        string.getClass();
        Array arrayOf = ArrayKt.arrayOf(new Match[0]);
        ws8 ws8Var = new ws8(kotlin.text.Regex.a(this._regex, string));
        while (ws8Var.hasNext()) {
            arrayOf.append((Array) new Match((MatchResult) ws8Var.next()));
        }
        return (Array) StructKt.sref$default(arrayOf, null, 1, null);
    }

    public final String replace(String string, int maxReplacements, Function1<? super Match, String> with) {
        string.getClass();
        with.getClass();
        if (maxReplacements <= 0) {
            return string;
        }
        return this._regex.e(string, new r22(new Object(), maxReplacements, with, 7));
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0086\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lskip/lib/Regex$Match;", "", "match", "Lkotlin/text/MatchResult;", "<init>", "(Lkotlin/text/MatchResult;)V", "getMatch$SkipLib", "()Lkotlin/text/MatchResult;", "count", "", "getCount", "()I", "get", "Lskip/lib/Regex$Match$MatchGroup;", "index", "MatchGroup", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Match {
        private final MatchResult match;

        public Match(MatchResult matchResult) {
            matchResult.getClass();
            this.match = (MatchResult) StructKt.sref$default(matchResult, null, 1, null);
        }

        public final MatchGroup get(int index) {
            return new MatchGroup(this.match.b().a(index));
        }

        public final int getCount() {
            return this.match.b().size();
        }

        /* renamed from: getMatch$SkipLib, reason: from getter */
        public final MatchResult getMatch() {
            return this.match;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lskip/lib/Regex$Match$MatchGroup;", "", "group", "Lkotlin/text/MatchGroup;", "<init>", "(Lkotlin/text/MatchGroup;)V", "getGroup$SkipLib", "()Lkotlin/text/MatchGroup;", "substring", "Lskip/lib/Substring;", "getSubstring", "()Lskip/lib/Substring;", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class MatchGroup {
            private final kotlin.text.MatchGroup group;

            public MatchGroup(kotlin.text.MatchGroup matchGroup) {
                this.group = (kotlin.text.MatchGroup) StructKt.sref$default(matchGroup, null, 1, null);
            }

            /* renamed from: getGroup$SkipLib, reason: from getter */
            public final kotlin.text.MatchGroup getGroup() {
                return this.group;
            }

            public final Substring getSubstring() {
                kotlin.text.MatchGroup matchGroup = this.group;
                if (matchGroup != null) {
                    return new Substring(matchGroup.a, 0);
                }
                return null;
            }

            public /* synthetic */ MatchGroup(kotlin.text.MatchGroup matchGroup, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : matchGroup);
            }
        }
    }

    @Override // skip.lib.RegexComponent
    public Regex getRegex() {
        return this;
    }

    public final String replace(String string, String with) {
        string.getClass();
        with.getClass();
        String quoteReplacement = Matcher.quoteReplacement(with);
        kotlin.text.Regex regex = this._regex;
        quoteReplacement.getClass();
        return regex.replace(string, quoteReplacement);
    }
}
