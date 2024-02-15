{"payload":{"allShortcutsEnabled":false,"fileTree":{"":{"items":[{"name":"System_hospitalier.java","path":"System_hospitalier.java","contentType":"file"}],"totalCount":1}},"fileTreeProcessingTime":1.4060469999999998,"foldersToFetch":[],"repo":{"id":754694340,"defaultBranch":"master","name":"TP1GIT","ownerLogin":"TPGLINSA","currentUserCanPush":false,"isFork":false,"isEmpty":false,"createdAt":"2024-02-08T15:37:05.000Z","ownerAvatar":"https://avatars.githubusercontent.com/u/159454036?v=4","public":true,"private":false,"isOrgOwned":false},"symbolsExpanded":false,"treeExpanded":true,"refInfo":{"name":"master","listCacheKey":"v0:1707468292.0","canEdit":false,"refType":"branch","currentOid":"d2b67b77c1fa3d198f854352c9d1dba6a3755652"},"path":"System_hospitalier.java","currentUser":null,"blob":{"rawLines":["package tp_git;\r","\r","import java.util.ArrayList;\r","import java.util.List;\r","\r","public class System_hospitalier {\r","\r","    private List<Requête> listRequetes;\r","\r","    public System_hospitalier(List<Requête> listRequetes) {\r","        super();\r","        this.listRequetes = listRequetes;\r","    }\r","\r","    public System_hospitalier() {\r","        super();\r","        listRequetes = new ArrayList<>();\r","    }\r","\r","    public List<Requête> getListRequetes() {\r","        return listRequetes;\r","    }\r","\r","    public void setListRequetes(List<Requête> listRequetes) {\r","        this.listRequetes = listRequetes;\r","    }\r","\r","    public void recevoirRequete(Requête requete) {\r","        listRequetes.add(requete);\r","        String analyse =  analyserRequete(requete);\r","        String comparaisonDonnees = comparerDonnes();\r","        System.out.println(analyse);\r","        System.out.println(comparaisonDonnees);\r","    }\r","\r","    private String analyserRequete(Requête requête) {\r","        \r","        return \"requête analysée\";\r","    }\r","\r","    private String comparerDonnes() {\r","        \r","        return \"Cluster trouvé\";\r","    }\r","\r","}\r"],"stylingDirectives":[[{"start":0,"end":7,"cssClass":"pl-k"},{"start":8,"end":14,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"},{"start":17,"end":26,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"},{"start":17,"end":21,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-k"},{"start":13,"end":31,"cssClass":"pl-smi"}],[],[{"start":4,"end":11,"cssClass":"pl-k"},{"start":12,"end":16,"cssClass":"pl-smi"},{"start":17,"end":24,"cssClass":"pl-smi"},{"start":26,"end":38,"cssClass":"pl-s1"}],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":29,"cssClass":"pl-smi"},{"start":30,"end":34,"cssClass":"pl-smi"},{"start":35,"end":42,"cssClass":"pl-smi"},{"start":44,"end":56,"cssClass":"pl-s1"}],[{"start":8,"end":13,"cssClass":"pl-en"}],[{"start":8,"end":12,"cssClass":"pl-smi"},{"start":13,"end":25,"cssClass":"pl-s1"},{"start":28,"end":40,"cssClass":"pl-s1"}],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":29,"cssClass":"pl-smi"}],[{"start":8,"end":13,"cssClass":"pl-en"}],[{"start":8,"end":20,"cssClass":"pl-s1"},{"start":23,"end":26,"cssClass":"pl-k"},{"start":27,"end":36,"cssClass":"pl-smi"}],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":23,"cssClass":"pl-smi"},{"start":25,"end":40,"cssClass":"pl-en"}],[{"start":8,"end":14,"cssClass":"pl-k"},{"start":15,"end":27,"cssClass":"pl-s1"}],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":31,"cssClass":"pl-en"},{"start":32,"end":36,"cssClass":"pl-smi"},{"start":37,"end":44,"cssClass":"pl-smi"},{"start":46,"end":58,"cssClass":"pl-s1"}],[{"start":8,"end":12,"cssClass":"pl-smi"},{"start":13,"end":25,"cssClass":"pl-s1"},{"start":28,"end":40,"cssClass":"pl-s1"}],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":31,"cssClass":"pl-en"},{"start":32,"end":39,"cssClass":"pl-smi"},{"start":40,"end":47,"cssClass":"pl-s1"}],[{"start":8,"end":20,"cssClass":"pl-s1"},{"start":21,"end":24,"cssClass":"pl-en"},{"start":25,"end":32,"cssClass":"pl-s1"}],[{"start":8,"end":14,"cssClass":"pl-smi"},{"start":15,"end":22,"cssClass":"pl-s1"},{"start":26,"end":41,"cssClass":"pl-en"},{"start":42,"end":49,"cssClass":"pl-s1"}],[{"start":8,"end":14,"cssClass":"pl-smi"},{"start":15,"end":33,"cssClass":"pl-s1"},{"start":36,"end":50,"cssClass":"pl-en"}],[{"start":8,"end":14,"cssClass":"pl-smi"},{"start":15,"end":18,"cssClass":"pl-s1"},{"start":19,"end":26,"cssClass":"pl-en"},{"start":27,"end":34,"cssClass":"pl-s1"}],[{"start":8,"end":14,"cssClass":"pl-smi"},{"start":15,"end":18,"cssClass":"pl-s1"},{"start":19,"end":26,"cssClass":"pl-en"},{"start":27,"end":45,"cssClass":"pl-s1"}],[],[],[{"start":4,"end":11,"cssClass":"pl-k"},{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":34,"cssClass":"pl-en"},{"start":35,"end":42,"cssClass":"pl-smi"},{"start":43,"end":50,"cssClass":"pl-s1"}],[],[{"start":8,"end":14,"cssClass":"pl-k"},{"start":15,"end":33,"cssClass":"pl-s"}],[],[],[{"start":4,"end":11,"cssClass":"pl-k"},{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":33,"cssClass":"pl-en"}],[],[{"start":8,"end":14,"cssClass":"pl-k"},{"start":15,"end":31,"cssClass":"pl-s"}],[],[],[]],"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":false,"configFilePath":null,"networkDependabotPath":"/TPGLINSA/TP1GIT/network/updates","dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":null,"repoAlertsPath":"/TPGLINSA/TP1GIT/security/dependabot","repoSecurityAndAnalysisPath":"/TPGLINSA/TP1GIT/settings/security_analysis","repoOwnerIsOrg":false,"currentUserCanAdminRepo":false},"displayName":"System_hospitalier.java","displayUrl":"https://github.com/TPGLINSA/TP1GIT/blob/master/System_hospitalier.java?raw=true","headerInfo":{"blobSize":"1.07 KB","deleteInfo":{"deleteTooltip":"You must be signed in to make or propose changes"},"editInfo":{"editTooltip":"You must be signed in to make or propose changes"},"ghDesktopPath":"https://desktop.github.com","gitLfsPath":null,"onBranch":true,"shortPath":"8308cb6","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgithub.com%2FTPGLINSA%2FTP1GIT%2Fblob%2Fmaster%2FSystem_hospitalier.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"46","truncatedSloc":"33"},"mode":"file"},"image":false,"isCodeownersFile":null,"isPlain":false,"isValidLegacyIssueTemplate":false,"issueTemplateHelpUrl":"https://docs.github.com/articles/about-issue-and-pull-request-templates","issueTemplate":null,"discussionTemplate":null,"language":"Java","languageID":181,"large":false,"loggedIn":false,"newDiscussionPath":"/TPGLINSA/TP1GIT/discussions/new","newIssuePath":"/TPGLINSA/TP1GIT/issues/new","planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/TPGLINSA/TP1GIT/blob/master/System_hospitalier.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","releasePath":"/TPGLINSA/TP1GIT/releases/new?marketplace=true","showPublishActionBanner":false},"rawBlobUrl":"https://github.com/TPGLINSA/TP1GIT/raw/master/System_hospitalier.java","renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"shortPath":null,"symbolsEnabled":true,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"repoOwner":"TPGLINSA","repoName":"TP1GIT","showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","showDependabotConfigurationBanner":false,"actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timed_out":false,"not_analyzed":false,"symbols":[{"name":"System_hospitalier","kind":"class","ident_start":87,"ident_end":105,"extent_start":74,"extent_end":1095,"fully_qualified_name":"System_hospitalier","ident_utf16":{"start":{"line_number":5,"utf16_col":13},"end":{"line_number":5,"utf16_col":31}},"extent_utf16":{"start":{"line_number":5,"utf16_col":0},"end":{"line_number":45,"utf16_col":1}}},{"name":"listRequetes","kind":"field","ident_start":138,"ident_end":150,"extent_start":115,"extent_end":151,"fully_qualified_name":"System_hospitalier::listRequetes","ident_utf16":{"start":{"line_number":7,"utf16_col":26},"end":{"line_number":7,"utf16_col":38}},"extent_utf16":{"start":{"line_number":7,"utf16_col":4},"end":{"line_number":7,"utf16_col":39}}},{"name":"System_hospitalier","kind":"method","ident_start":166,"ident_end":184,"extent_start":159,"extent_end":283,"fully_qualified_name":"System_hospitalier::System_hospitalier","ident_utf16":{"start":{"line_number":9,"utf16_col":11},"end":{"line_number":9,"utf16_col":29}},"extent_utf16":{"start":{"line_number":9,"utf16_col":4},"end":{"line_number":12,"utf16_col":5}}},{"name":"System_hospitalier","kind":"method","ident_start":298,"ident_end":316,"extent_start":291,"extent_end":388,"fully_qualified_name":"System_hospitalier::System_hospitalier","ident_utf16":{"start":{"line_number":14,"utf16_col":11},"end":{"line_number":14,"utf16_col":29}},"extent_utf16":{"start":{"line_number":14,"utf16_col":4},"end":{"line_number":17,"utf16_col":5}}},{"name":"getListRequetes","kind":"method","ident_start":418,"ident_end":433,"extent_start":396,"extent_end":474,"fully_qualified_name":"System_hospitalier::getListRequetes","ident_utf16":{"start":{"line_number":19,"utf16_col":25},"end":{"line_number":19,"utf16_col":40}},"extent_utf16":{"start":{"line_number":19,"utf16_col":4},"end":{"line_number":21,"utf16_col":5}}},{"name":"setListRequetes","kind":"method","ident_start":494,"ident_end":509,"extent_start":482,"extent_end":590,"fully_qualified_name":"System_hospitalier::setListRequetes","ident_utf16":{"start":{"line_number":23,"utf16_col":16},"end":{"line_number":23,"utf16_col":31}},"extent_utf16":{"start":{"line_number":23,"utf16_col":4},"end":{"line_number":25,"utf16_col":5}}},{"name":"recevoirRequete","kind":"method","ident_start":610,"ident_end":625,"extent_start":598,"extent_end":883,"fully_qualified_name":"System_hospitalier::recevoirRequete","ident_utf16":{"start":{"line_number":27,"utf16_col":16},"end":{"line_number":27,"utf16_col":31}},"extent_utf16":{"start":{"line_number":27,"utf16_col":4},"end":{"line_number":33,"utf16_col":5}}},{"name":"analyserRequete","kind":"method","ident_start":906,"ident_end":921,"extent_start":891,"extent_end":997,"fully_qualified_name":"System_hospitalier::analyserRequete","ident_utf16":{"start":{"line_number":35,"utf16_col":19},"end":{"line_number":35,"utf16_col":34}},"extent_utf16":{"start":{"line_number":35,"utf16_col":4},"end":{"line_number":38,"utf16_col":5}}},{"name":"comparerDonnes","kind":"method","ident_start":1020,"ident_end":1034,"extent_start":1005,"extent_end":1090,"fully_qualified_name":"System_hospitalier::comparerDonnes","ident_utf16":{"start":{"line_number":40,"utf16_col":19},"end":{"line_number":40,"utf16_col":33}},"extent_utf16":{"start":{"line_number":40,"utf16_col":4},"end":{"line_number":43,"utf16_col":5}}}]}},"copilotInfo":null,"copilotAccessAllowed":false,"csrf_tokens":{"/TPGLINSA/TP1GIT/branches":{"post":"ObiZ4effnp4jhbn9EF2FdSypPIqfFCbmwcZsl6jQvvsoEmkucUNp8DutPbSvvbaPQkUBLiNBFcFuyC2tUa4x-Q"},"/repos/preferences":{"post":"_sr0ThODk2f4tqrFCbPg_DCtN1szGEh2Z_s-uC0S6ufbqs6u2l_u0SJ9VRGgOISzPUD6unoJAaEwt6gdPVv28g"}}},"title":"TP1GIT/System_hospitalier.java at master · TPGLINSA/TP1GIT"}