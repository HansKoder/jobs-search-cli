package org.hans.demo.apijobs.job;

import java.io.Serializable;
import java.util.UUID;

public class JobPosition implements Serializable{

    private String id;
    private String type;
    private String url;

    private String created_at;

    private String company;

    private String company_url;

    private String title;

    private String location;

    private String description;

    private String companyLogo;

    public JobPosition(JobPositionBuilder builder) {
        this.company = builder.getCompany();
        this.company_url = builder.getCompany_url();
        this.created_at = builder.getCreated_at();
        this.companyLogo = builder.getCompanyLogo();
        this.description = builder.getDescription();
        this.id = builder.getId();
        this.location = builder.getLocation();
        this.title = builder.getTitle();
        this.type = builder.getType();
        this.url = builder.getUrl();
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getCompany() {
        return company;
    }

    public String getCompany_url() {
        return company_url;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    // Builder class
    public static class JobPositionBuilder {

        private String id = UUID.randomUUID().toString();
        private String type;
        private String url;
        private String created_at;
        private String company;
        private String company_url;
        private String title;
        private String location;
        private String description;
        private String companyLogo;


        public JobPositionBuilder addDescription (String p) {
            this.description = p;

            return this;
        }

        public JobPositionBuilder addType (String p) {
            this.type = p;

            return this;
        }

        public JobPositionBuilder addLocation (String p) {
            this.location = p;

            return this;
        }

        public JobPositionBuilder addTitle (String p) {
            this.title = p;

            return this;
        }

        public JobPositionBuilder addUrl (String p) {
            this.url = p;

            return this;
        }

        public JobPositionBuilder addCompanyUrl (String p) {
            this.company_url = p;

            return this;
        }

        public JobPositionBuilder addCompany (String p) {
            this.company = p;

            return this;
        }


        public JobPositionBuilder addCompanyLogo (String p) {
            this.companyLogo = p;

            return this;
        }

        public JobPositionBuilder addCreatedAt (String p) {
            this.created_at = p;

            return this;
        }

        public JobPosition build () {
            return new JobPosition(this);
        }

        // Getters

        public String getId() {
            return id;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getCompany() {
            return company;
        }

        public String getCompany_url() {
            return company_url;
        }

        public String getTitle() {
            return title;
        }

        public String getLocation() {
            return location;
        }

        public String getDescription() {
            return description;
        }

        public String getCompanyLogo() {
            return companyLogo;
        }
    }

}
