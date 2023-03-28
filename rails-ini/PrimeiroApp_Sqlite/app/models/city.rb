class City < ApplicationRecord
    belongs_to :state
end

class State < ApplicationRecord
    has_many :cities
end