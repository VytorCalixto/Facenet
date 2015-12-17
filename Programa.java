class Programa {
    public static void main(String[] args) {
        System.out.println("Rede Social!");
        Person p1 = new Person("Leia Organa", "leia");
        Person p2 = new Person("Chewbacca", "chewie");
        Person p3 = new Person("Han Solo", "solo");
        Group g1 = new Group("Aliança Rebelde", "rebels");
        Group g2 = new Group("Nova República", "nova-republica");

        p1.addRelation(new Relation(p2, RelationType.AMIGO));
        p1.addRelation(new Relation(p3, RelationType.AMIGO));
        p1.addRelation(new Relation(p3, RelationType.RELACIONAMENTO));
        p1.joinGroup(g1);

        p2.addRelation(new Relation(p3, RelationType.AMIGO));
        p2.joinGroup(g1);
        p2.joinGroup(g2);

        p3.addRelation(new Relation(p1, RelationType.PARENTE));
        p3.addRelation(new Relation(p2, RelationType.CONHECIDO));

        Publication pub = new Publication(PublicationType.PENSAMENTO, p1, "Salve-nos Obi-Wan, você é nossa última esperança.");
        p1.getTimeline().post(pub);
        p2.getTimeline().like(pub);
        p2.getTimeline().comment(pub, "ARRRRRRRRRR ARRR ERRRR");

        pub = new Publication(PublicationType.PENSAMENTO, g1, "Perdemos a base de Hoth!");
        g1.getTimeline().post(pub);
        p2.getTimeline().dislike(pub);
        p2.leaveGroup(g1);
    }
}
