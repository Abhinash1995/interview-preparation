package com.company;

public class CreateDummy {
//
//    //    TODO:Delete Me
//    @Transactional
//    public List<ProjectModel> saveDummyProjects(List<ProjectModel> projectModel, String createdBy) {
//        List<DropdownModel> languages = cacheService.getAllLanguages();
//        List<DropdownModel> nieches = cacheService.getMetaData("CREATORS_NICHE");
//        List<DropdownModel> creatorTypes = cacheService.getMetaData("REQUIRED_INFLUENCERS");
//
//        Random random = new Random();
//        for (ProjectModel model : projectModel){
//            model.setClientId(5L);
//            model.setCreatedBy(createdBy);
//            TknConstants.ProjectStatus[] statues = TknConstants.ProjectStatus.values();
//            model.setStatus(statues[random.nextInt(statues.length)].name());
//            model.setLanguages(getItems(languages, random));
//            ObjectNode location = new ObjectNode(CommonUtil.getMapper().getNodeFactory());
//            location.set("formattedAddress",  new TextNode(model.getContentCreatorNiche()));
//            model.setLocation(location);
//            model.setContentCreatorNiche(nieches.get(random.nextInt(nieches.size())).getKey());
//            model.setCreatorType(Arrays.asList(getItems(creatorTypes, random)));
//        }
//        List<Project> project = ProjectMapper.INSTANCE.getProjectList(projectModel);
//        project = projectRepos.saveAll(project);
//        return ProjectMapper.INSTANCE.getProjectModelList(project);
//
//    }
//
//    private String[] getItems(List<DropdownModel> items, Random random) {
//        int length = random.nextInt(items.size());
//        String[] data = new String[length];
//        for(int i = 0; i < length; i++) {
//            data[i] = items.get(random.nextInt(items.size())).getKey();
//        }
//        return data;
//    }
}
